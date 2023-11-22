package StackInterpreter;

import java.util.HashMap;
import java.util.Stack;

public class Context {
    private Stack<Double> _stack;
    private HashMap<String, Double> _parameters;

    public double stackPop() {
        return _stack.pop();
    }

    public double stackPush(double value) {
        return _stack.push(value);
    }

    public double assignParameter(String name, double value) {
        _parameters.put(name, value);
        return value;
    }

    public double getParameter(String name) {
        return _parameters.get(name);
    }
}
