package com.hwwu.lamlite.ast;


import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.value.RecordType;
import com.hwwu.lamlite.value.RecordValue;
import com.hwwu.lamlite.value.Value;

public class Attr extends Node {
    public Node value;
    public Name attr;


    public Attr(Node value, Name attr, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.value = value;
        this.attr = attr;
    }


    @Override
    public Value interp(Scope s) {
        Value record = value.interp(s);
        if (record instanceof RecordValue) {
            Value a = ((RecordValue) record).properties.lookupLocal(attr.id);
            if (a != null) {
                return a;
            } else {
                Util.abort(attr, "attribute " + attr + " not found in record: " + record);
                return null;
            }
        } else {
            Util.abort(attr, "getting attribute of non-record: " + record);
            return null;
        }
    }


    @Override
    public Value typecheck(Scope s) {
        Value record = value.typecheck(s);
        if (record instanceof RecordValue) {
            Value a = ((RecordValue) record).properties.lookupLocal(attr.id);
            if (a != null) {
                return a;
            } else {
                Util.abort(attr, "attribute " + attr + " not found in record: " + record);
                return null;
            }
        } else {
            Util.abort(attr, "getting attribute of non-record: " + record);
            return null;
        }
    }


    public void set(Value v, Scope s) {
        Value record = value.interp(s);
        if (record instanceof RecordType) {
            Value a = ((RecordType) record).properties.lookup(attr.id);
            if (a != null) {
                ((RecordType) record).properties.putValue(attr.id, v);
            } else {
                Util.abort(attr,
                        "can only assign to existing attribute in record, " + attr + " not found in: " + record);
            }
        } else {
            Util.abort(attr, "setting attribute of non-record: " + record);
        }
    }


    public String toString() {
        return value + "." + attr;
    }

}
