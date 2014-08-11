package com.hwwu.lamlite.value;


import com.hwwu.lamlite.Constants;
import com.hwwu.lamlite.Scope;


public class RecordValue extends Value {

    public String name;
    public RecordType type;
    public Scope properties;


    public RecordValue(String name, RecordType type, Scope properties) {
        this.name = name;
        this.type = type;
        this.properties = properties;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.PAREN_BEGIN);
        sb.append(Constants.RECORD_KEYWORD).append(" ");
        sb.append(name == null ? "_" : name);

        for (String field : properties.keySet()) {
            sb.append(" ").append(Constants.SQUARE_BEGIN);
            sb.append(field).append(" ");
            sb.append(properties.lookupLocal(field));
            sb.append(Constants.SQUARE_END);
        }

        sb.append(Constants.PAREN_END);
        return sb.toString();
    }

}
