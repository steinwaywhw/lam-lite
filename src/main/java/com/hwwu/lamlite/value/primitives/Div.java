package com.hwwu.lamlite.value.primitives;


import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.ast.Node;
import com.hwwu.lamlite.value.*;

import java.util.List;

public class Div extends PrimFun {

    public Div() {
        super("/", 2);
    }


    @Override
    public Value apply(List<Value> args, Node location) {
        Value v1 = args.get(0);
        Value v2 = args.get(1);
        if (v1 instanceof IntValue && v2 instanceof IntValue) {
            return new IntValue(((IntValue) v1).value / ((IntValue) v2).value);
        }
        if (v1 instanceof FloatValue && v2 instanceof FloatValue) {
            return new FloatValue(((FloatValue) v1).value / ((FloatValue) v2).value);
        }
        if (v1 instanceof FloatValue && v2 instanceof IntValue) {
            return new FloatValue(((FloatValue) v1).value / ((IntValue) v2).value);
        }
        if (v1 instanceof IntValue && v2 instanceof FloatValue) {
            return new FloatValue(((IntValue) v1).value / ((FloatValue) v2).value);
        }

        Util.abort(location, "incorrect argument types for /: " + v1 + ", " + v2);
        return null;
    }


    public Value typecheck(List<Value> args, Node location) {
        Value v1 = args.get(0);
        Value v2 = args.get(1);

        if (v1 instanceof FloatType || v2 instanceof FloatType) {
            return new FloatType();
        }
        if (v1 instanceof IntType && v2 instanceof IntType) {
            return Type.INT;
        }
        Util.abort(location, "incorrect argument types for /: " + v1 + ", " + v2);
        return null;
    }
}
