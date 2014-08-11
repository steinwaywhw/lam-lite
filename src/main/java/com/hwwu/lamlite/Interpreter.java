package com.hwwu.lamlite;


import com.hwwu.lamlite.ast.Node;
import com.hwwu.lamlite.parser.Parser;
import com.hwwu.lamlite.parser.ParserException;
import com.hwwu.lamlite.value.Value;

public class Interpreter {

    String file;


    public Interpreter(String file) {
        this.file = file;
    }


    public Value interp(String file) {
        Node program;
        try {
            program = Parser.parse(file);
        } catch (ParserException e) {
            Util.abort("parsing error: " + e);
            return null;
        }
        return program.interp(Scope.buildInitScope());
    }


    public static void main(String[] args) {
        Interpreter i = new Interpreter(args[0]);
        Util.msg(i.interp(args[0]).toString());
    }

}
