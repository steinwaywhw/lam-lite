package com.hwwu.lamlite;

import com.hwwu.lamlite.value.BoolValue;
import com.hwwu.lamlite.value.Type;
import com.hwwu.lamlite.value.Value;
import com.hwwu.lamlite.value.primitives.*;

import java.util.Map;
import java.util.LinkedHashMap; // Linked to make sure the traverse order is that same as the order it was put into map
import java.util.Set;

public class Scope {

	public Map<String, Map<String, Object>> table = new LinkedHashMap<>();
	public Scope parent;

	public String KEY_VALUE "value";
	public String KEY_TYPE "type";

	public Scope() {
        this.parent = null;
    }


    public Scope(Scope parent) {
        this.parent = parent;
    }

    public Scope copy() {
        Scope ret = new Scope();
        for (String name : table.keySet()) {
            Map<String, Object> props = new LinkedHashMap<>();
            props.putAll(table.get(name));
            ret.table.put(name, props);
        }
        return ret;
    }

    public void putAll(Scope other) {
        for (String name : other.table.keySet()) {
            Map<String, Object> props = new LinkedHashMap<>();
            props.putAll(other.table.get(name));
            table.put(name, props);
        }
    }

    public Value lookup(String name) {
        Object v = lookupProperty(name, KEY_VALUE);
        if (v == null) {
            return null;
        } else if (v instanceof Value) {
            return (Value) v;
        } else {
            Util.abort("Not a Value, shouldn't happen: " + v);
            return null;
        }
    }


    public Value lookupLocal(String name) {
        Object v = lookupPropertyLocal(name, KEY_VALUE);
        if (v == null) {
            return null;
        } else if (v instanceof Value) {
            return (Value) v;
        } else {
            Util.abort("Not a Value, shouldn't happen: " + v);
            return null;
        }
    }


    public Value lookupType(String name) {
        Object v = lookupProperty(name, KEY_TYPE);
        if (v == null) {
            return null;
        } else if (v instanceof Value) {
            return (Value) v;
        } else {
            Util.abort("Not a Value, shouldn't happen: " + v);
            return null;
        }
    }


    public Value lookupTypeLocal(String name) {
        Object v = lookupPropertyLocal(name, KEY_VALUE);
        if (v == null) {
            return null;
        } else if (v instanceof Value) {
            return (Value) v;
        } else {
            Util.abort("Not a Value, shouldn't happen: " + v);
            return null;
        }
    }


    public Object lookupPropertyLocal(String name, String key) {
        Map<String, Object> item = table.get(name);
        if (item != null) {
            return item.get(key);
        } else {
            return null;
        }
    }


    public Object lookupProperty(String name, String key) {
        Object v = lookupPropertyLocal(name, key);
        if (v != null) {
            return v;
        } else if (parent != null) {
            return parent.lookupProperty(name, key);
        } else {
            return null;
        }
    }


    public Map<String, Object> lookupAllProps(String name) {
        return table.get(name);
    }


    public Scope findDefiningScope(String name) {
        Object v = table.get(name);
        if (v != null) {
            return this;
        } else if (parent != null) {
            return parent.findDefiningScope(name);
        } else {
            return null;
        }
    }


    public static Scope buildInitScope() {
        Scope init = new Scope();

        init.putValue("+", new Add());
        init.putValue("-", new Sub());
        init.putValue("*", new Mult());
        init.putValue("/", new Div());

        init.putValue("<", new Lt());
        init.putValue("<=", new LtE());
        init.putValue(">", new Gt());
        init.putValue(">=", new GtE());
        init.putValue("=", new Eq());
        init.putValue("and", new And());
        init.putValue("or", new Or());
        init.putValue("not", new Not());

        init.putValue("print", new Print());

        init.putValue("true", new BoolValue(true));
        init.putValue("false", new BoolValue(false));

        init.putValue("int", Type.INT);
        init.putValue("bool", Type.BOOL);
        init.putValue("string", Type.STRING);

        return init;
    }


    public static Scope buildInitTypeScope() {
        Scope init = new Scope();

        init.putValue("+", new Add());
        init.putValue("-", new Sub());
        init.putValue("*", new Mult());
        init.putValue("/", new Div());

        init.putValue("<", new Lt());
        init.putValue("<=", new LtE());
        init.putValue(">", new Gt());
        init.putValue(">=", new GtE());
        init.putValue("=", new Eq());
        init.putValue("and", new And());
        init.putValue("or", new Or());
        init.putValue("not", new Not());
        init.putValue("U", new U());

        init.putValue("true", Type.BOOL);
        init.putValue("false", Type.BOOL);

        init.putValue("Int", Type.INT);
        init.putValue("Bool", Type.BOOL);
        init.putValue("String", Type.STRING);
        init.putValue("Any", Value.ANY);

        return init;
    }


    public void put(String name, String key, Object value) {
        Map<String, Object> item = table.get(name);
        if (item == null) {
            item = new LinkedHashMap<>();
        }
        item.put(key, value);
        table.put(name, item);
    }


    public void putAll(String name, Map<String, Object> props) {
        Map<String, Object> item = table.get(name);
        if (item == null) {
            item = new LinkedHashMap<>();
        }
        item.putAll(props);
        table.put(name, item);
    }


    public void putValue(String name, Value value) {
        put(name, KEY_VALUE, value);
    }


    public void putType(String name, Value value) {
        put(name, KEY_TYPE, value);
    }


    public Set<String> keySet() {
        return table.keySet();
    }


    public boolean containsKey(String key) {
        return table.containsKey(key);
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String name : table.keySet()) {
            sb.append(Constants.SQUARE_BEGIN).append(name).append(" ");
            for (Map.Entry<String, Object> e : table.get(name).entrySet()) {
                sb.append(":" + e.getKey() + " " + e.getValue());
            }
            sb.append(Constants.SQUARE_END);
        }
        return sb.toString();
    }
}