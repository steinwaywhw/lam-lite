package com.hwwu.lamlite.value.primitives;


import com.hwwu.lamlite.ast.Node;
import com.hwwu.lamlite.value.PrimFun;
import com.hwwu.lamlite.value.UnionType;
import com.hwwu.lamlite.value.Value;

import java.util.List;

public class U extends PrimFun {

    public U() {
        super("U", -1);
    }


    @Override
    public Value apply(List<Value> args, Node location) {
        return null;
    }


    public Value typecheck(List<Value> args, Node location) {
        return UnionType.union(args);
    }

}
