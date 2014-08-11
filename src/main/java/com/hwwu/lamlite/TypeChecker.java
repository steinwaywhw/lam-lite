package com.hwwu.lamlite;


import com.hwwu.lamlite.ast.Declare;
import com.hwwu.lamlite.ast.Node;
import com.hwwu.lamlite.parser.Parser;
import com.hwwu.lamlite.parser.ParserException;
import com.hwwu.lamlite.value.FunType;
import com.hwwu.lamlite.value.Type;
import com.hwwu.lamlite.value.Value;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TypeChecker {

    public static TypeChecker self;
    public String file;
    public Set<FunType> uncalled = new HashSet<>();
    public Set<FunType> callStack = new HashSet<>();


    public TypeChecker(String file) {
        this.file = file;
    }


    public Value typecheck(String file) {
        Node program;
        try {
            program = Parser.parse(file);
        } catch (ParserException e) {
            Util.abort("parsing error: " + e);
            return null;
        }
        Scope s = Scope.buildInitTypeScope();
        Value ret = program.typecheck(s);

        while (!uncalled.isEmpty()) {
            List<FunType> toRemove = new ArrayList<>(uncalled);
            for (FunType ft : toRemove) {
                invokeUncalled(ft, s);
            }
            uncalled.removeAll(toRemove);
        }

        return ret;
    }


    public void invokeUncalled(FunType fun, Scope s) {
        Scope funScope = new Scope(fun.env);
        if (fun.properties != null) {
            Declare.mergeType(fun.properties, funScope);
        }

        TypeChecker.self.callStack.add(fun);
        Value actual = fun.fun.body.typecheck(funScope);
        TypeChecker.self.callStack.remove(fun);

        Object retNode = fun.properties.lookupPropertyLocal(Constants.RETURN_ARROW, "type");

        if (retNode == null || !(retNode instanceof Node)) {
            Util.abort("illegal return type: " + retNode);
            return;
        }

        Value expected = ((Node) retNode).typecheck(funScope);
        if (!Type.subtype(actual, expected, true)) {
            Util.abort(fun.fun, "type error in return value, expected: " + expected + ", actual: " + actual);
        }
    }


    public static void main(String[] args) {
        TypeChecker tc = new TypeChecker(args[0]);
        TypeChecker.self = tc;
        Value result = tc.typecheck(args[0]);
        Util.msg(result.toString());
    }

}
