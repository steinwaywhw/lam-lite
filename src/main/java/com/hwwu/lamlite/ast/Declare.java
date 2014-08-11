package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.value.Value;

import java.util.Map;


public class Declare extends Node {
    public Scope propertyForm;


    public Declare(Scope propertyForm, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.propertyForm = propertyForm;
    }


    public Value interp(Scope s) {
//        mergeProperties(propsNode, s);
        return Value.VOID;
    }


    @Override
    public Value typecheck(Scope s) {
        return null;
    }


    public static void mergeDefault(Scope properties, Scope s) {
        for (String key : properties.keySet()) {
            Object defaultValue = properties.lookupPropertyLocal(key, "default");
            if (defaultValue == null) {
                continue;
            } else if (defaultValue instanceof Value) {
                Value existing = s.lookup(key);
                if (existing == null) {
                    s.putValue(key, (Value) defaultValue);
                }
            } else {
                Util.abort("default value is not a value, shouldn't happen");
            }
        }
    }


    public static void mergeType(Scope properties, Scope s) {
        for (String key : properties.keySet()) {
            if (key.equals(Constants.RETURN_ARROW)) {
                continue;
            }
            Object type = properties.lookupPropertyLocal(key, "type");
            if (type == null) {
                continue;
            } else if (type instanceof Value) {
                Value existing = s.lookup(key);
                if (existing == null) {
                    s.putValue(key, (Value) type);
                }
            } else {
                Util.abort("illegal type, shouldn't happen" + type);
            }
        }
    }


    public static Scope evalProperties(Scope unevaled, Scope s) {
        Scope evaled = new Scope();

        for (String field : unevaled.keySet()) {
            Map<String, Object> props = unevaled.lookupAllProps(field);
            for (Map.Entry<String, Object> e : props.entrySet()) {
                Object v = e.getValue();
                if (v instanceof Node) {
                    Value vValue = ((Node) v).interp(s);
                    evaled.put(field, e.getKey(), vValue);
                } else {
                    Util.abort("property is not a node, parser bug: " + v);
                }
            }
        }
        return evaled;
    }


    public static Scope typecheckProperties(Scope unevaled, Scope s) {
        Scope evaled = new Scope();

        for (String field : unevaled.keySet()) {
            if (field.equals(Constants.RETURN_ARROW)) {
                evaled.putProperties(field, unevaled.lookupAllProps(field));
            } else {
                Map<String, Object> props = unevaled.lookupAllProps(field);
                for (Map.Entry<String, Object> e : props.entrySet()) {
                    Object v = e.getValue();
                    if (v instanceof Node) {
                        Value vValue = ((Node) v).typecheck(s);
                        evaled.put(field, e.getKey(), vValue);
                    } else {
                        Util.abort("property is not a node, parser bug: " + v);
                    }
                }
            }
        }
        return evaled;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.PAREN_BEGIN);
        sb.append(Constants.DECLARE_KEYWORD).append(" ");

        for (String field : propertyForm.keySet()) {
            Map<String, Object> props = propertyForm.lookupAllProps(field);
            for (Map.Entry<String, Object> e : props.entrySet()) {
                sb.append(" :" + e.getKey() + " " + e.getValue());
            }
        }

        sb.append(Constants.PAREN_END);
        return sb.toString();
    }
}
