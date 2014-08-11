package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.Util;
import com.hwwu.lamlite.value.RecordType;
import com.hwwu.lamlite.value.Value;

import java.util.List;
import java.util.Map;


public class RecordDef extends Node {
    public Name name;
    public List<Name> parents;
    public Scope propertyForm;
    public Scope properties;


    public RecordDef(Name name, List<Name> parents, Scope propertyForm,
                     String file, int start, int end, int line, int col)
    {
        super(file, start, end, line, col);
        this.name = name;
        this.parents = parents;
        this.propertyForm = propertyForm;
    }


    public Value interp(Scope s) {
        Scope properties = Declare.evalProperties(propertyForm, s);

        if (parents != null) {
            for (Node p : parents) {
                Value pv = p.interp(s);
                properties.putAll(((RecordType) pv).properties);
            }
        }
        Value r = new RecordType(name.id, this, properties);
        s.putValue(name.id, r);
        return r;
    }


    @Override
    public Value typecheck(Scope s) {
        Scope properties = Declare.typecheckProperties(propertyForm, s);

        if (parents != null) {
            for (Node p : parents) {
                Value pv = p.typecheck(s);
                if (!(pv instanceof RecordType)) {
                    Util.abort(p, "parent is not a record: " + pv);
                    return null;
                }
                Scope parentProps = ((RecordType) pv).properties;

                // check for duplicated keys
                for (String key : parentProps.keySet()) {
                    Value existing = properties.lookupLocalType(key);
                    if (existing != null) {
                        Util.abort(p, "conflicting field " + key +
                                " inherited from parent " + p + ": " + pv);
                        return null;
                    }
                }

                // add all properties or all fields in parent
                properties.putAll(parentProps);
            }
        }

        Value r = new RecordType(name.id, this, properties);
        s.putValue(name.id, r);
        return r;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.PAREN_BEGIN);
        sb.append(Constants.RECORD_KEYWORD).append(" ");
        sb.append(name).append(" ");

        if (parents != null) {
            sb.append(" (" + Node.printList(parents) + ")");
        }

        for (String field : propertyForm.keySet()) {
            sb.append("[" + field);
            Map<String, Object> props = propertyForm.lookupAllProps(field);
            for (Map.Entry<String, Object> e : props.entrySet()) {
                sb.append(" :" + e.getKey() + " " + e.getValue());
            }
            sb.append("]");
        }

        sb.append(Constants.PAREN_END);
        return sb.toString();
    }
}
