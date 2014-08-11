package com.hwwu.lamlite.ast;


import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.TypeChecker;
import com.hwwu.lamlite.value.Closure;
import com.hwwu.lamlite.value.FunType;
import com.hwwu.lamlite.value.Value;

import java.util.List;

public class Fun extends Node {
    public List<Name> params;
    public Node body;
    public Scope propertyForm;


    public Fun(List<Name> params, Scope propertyForm, Node body, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.params = params;
        this.propertyForm = propertyForm;     // unevaluated property form
        this.body = body;
    }


    public Value interp(Scope s) {
        // evaluate and cache the properties in the closure
        Scope properties = propertyForm == null ? null : Declare.evalProperties(propertyForm, s);
        return new Closure(this, properties, s);
    }


    @Override
    public Value typecheck(Scope s) {
        // evaluate and cache the properties in the closure
        Scope properties = propertyForm == null ? null : Declare.typecheckProperties(propertyForm, s);
        FunType ft = new FunType(this, properties, s);
        TypeChecker.self.uncalled.add(ft);
        return ft;
    }


    public String toString() {
        return "(" + Constants.FUN_KEYWORD + " (" + params + ") " + body + ")";
    }

}
