package com.hwwu.lamlite.value.primitives;


import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.ast.Node;
import com.hwwu.lamlite.value.*;

import java.util.List;

public class Or extends PrimFun {

    public Or() {
        super("and", 2);
    }


    @Override
    public Value apply(List<Value> args, Node location) {

        Value v1 = args.get(0);
        Value v2 = args.get(1);
        if (v1 instanceof BoolValue && v2 instanceof BoolValue) {
            return new BoolValue(((BoolValue) v1).value || ((BoolValue) v2).value);
        }

        Util.abort(location, "incorrect argument types for and: " + v1 + ", " + v2);
        return null;
    }


    public Value typecheck(List<Value> args, Node location) {
        Value v1 = args.get(0);
        Value v2 = args.get(1);

        if (v1 instanceof BoolType && v2 instanceof BoolType) {
            return Type.BOOL;
        }
        Util.abort(location, "incorrect argument types for or: " + v1 + ", " + v2);
        return null;
    }
}
