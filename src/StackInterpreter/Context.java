package StackInterpreter;

import StackInterpreter.Exeptions.StackIsEmptyException;
import StackInterpreter.Exeptions.UndefinedParameterException;

import java.util.HashMap;
import java.util.Stack;

public class Context {
    private Stack<Double> _stack = new Stack<>();
    private HashMap<String, Double> _parameters = new HashMap<>();

    public double stackPop() {
        if (_stack.isEmpty())
            throw new StackIsEmptyException("Stack has not elements");
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
        if (!_parameters.containsKey(name))
            throw new UndefinedParameterException(String.format("Parameter '%s' is undefined", name));
        return _parameters.get(name);
    }
}
