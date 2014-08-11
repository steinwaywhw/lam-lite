package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Binder;
import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.value.Value;

public class Def extends Node {
    public Node pattern;
    public Node value;


    public Def(Node pattern, Node value, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.pattern = pattern;
        this.value = value;
    }


    public Value interp(Scope s) {
        Value valueValue = value.interp(s);
        Binder.checkDup(pattern);
        Binder.define(pattern, valueValue, s);
        return Value.VOID;
    }


    @Override
    public Value typecheck(Scope s) {
        Value t = value.typecheck(s);
        Binder.checkDup(pattern);
        Binder.define(pattern, t, s);
        return Value.VOID;
    }


    public String toString() {
        return "(" + Constants.DEF_KEYWORD + " " + pattern + " " + value + ")";
    }

}
