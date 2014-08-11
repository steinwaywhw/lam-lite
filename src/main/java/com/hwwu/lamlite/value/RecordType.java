package com.hwwu.lamlite.value;


import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;
import com.hwwu.lamlite.ast.Node;

import java.util.Map;


public class RecordType extends Value {

    public String name;
    public Node definition;
    public Scope properties;


    public RecordType(String name, Node definition, Scope properties) {
        this.name = name;
        this.definition = definition;
        this.properties = properties.copy();
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.PAREN_BEGIN);
        sb.append(Constants.RECORD_KEYWORD).append(" ");
        sb.append(name == null ? "_" : name);

        for (String field : properties.keySet()) {
            sb.append(" ").append(Constants.SQUARE_BEGIN);
            sb.append(field);

            Map<String, Object> m = properties.lookupAllProps(field);
            for (String key : m.keySet()) {
                Object value = m.get(key);
                if (value != null) {
                    sb.append(" :" + key + " " + value);
                }
            }
            sb.append(Constants.SQUARE_END);
        }

        sb.append(Constants.PAREN_END);
        return sb.toString();
    }

}
