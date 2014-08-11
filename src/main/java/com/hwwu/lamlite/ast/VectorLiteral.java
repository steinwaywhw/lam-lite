package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.value.Value;
import com.hwwu.lamlite.value.Vector;

import java.util.List;

public class VectorLiteral extends Node {

    public List<Node> elements;


    public VectorLiteral(List<Node> elements, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.elements = elements;
    }


    @Override
    public Value interp(Scope s) {
        return new Vector(interpList(elements, s));
    }


    @Override
    public Value typecheck(Scope s) {
        return new Vector(typecheckList(elements, s));
    }

}
