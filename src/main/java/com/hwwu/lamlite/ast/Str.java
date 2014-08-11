package com.hwwu.lamlite.ast;


import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.value.StringType;
import com.hwwu.lamlite.value.StringValue;
import com.hwwu.lamlite.value.Type;
import com.hwwu.lamlite.value.Value;

public class Str extends Node {
    public String value;


    public Str(String value, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.value = value;
    }


    public Value interp(Scope s) {
        return new StringValue(value);
    }


    @Override
    public Value typecheck(Scope s) {
        return Type.STRING;
    }


    public String toString() {
        return "\"" + value + "\"";
    }

}
