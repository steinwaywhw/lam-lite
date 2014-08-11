package com.hwwu.lamlite.value;


import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.ast.Fun;

public class Closure extends Value {

    public Fun fun;
    public Scope properties;
    public Scope env;


    public Closure(Fun fun, Scope properties, Scope env) {
        this.fun = fun;
        this.properties = properties;
        this.env = env;
    }


    public String toString() {
        return fun.toString();
    }

}
