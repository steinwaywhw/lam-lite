package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.value.BoolType;
import com.hwwu.lamlite.value.BoolValue;
import com.hwwu.lamlite.value.UnionType;
import com.hwwu.lamlite.value.Value;

public class If extends Node {
    public Node test;
    public Node then;
    public Node orelse;


    public If(Node test, Node then, Node orelse, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.test = test;
        this.then = then;
        this.orelse = orelse;
    }


    public Value interp(Scope s) {
        Value tv = interp(test, s);
        if (((BoolValue) tv).value) {
            return interp(then, s);
        } else {
            return interp(orelse, s);
        }
    }


    @Override
    public Value typecheck(Scope s) {
        Value tv = typecheck(test, s);
        if (!(tv instanceof BoolType)) {
            Util.abort(test, "test is not boolean: " + tv);
            return null;
        }
        Value type1 = typecheck(then, s);
        Value type2 = typecheck(orelse, s);
        return UnionType.union(type1, type2);
    }


    public String toString() {
        return "(" + Constants.IF_KEYWORD + " " + test + " " + then + " " + orelse + ")";
    }

}
