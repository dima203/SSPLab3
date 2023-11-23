package StackInterpreter;

import java.util.Stack;

public class ParameterCommand implements StackCommand {
    private final String _name;

    public ParameterCommand(String name) {
        _name = name;
    }

    @Override
    public double execute(Context context) {
        return context.getParameter(_name);
    }

    public String getName() { return _name; }

    public String toString() {
        return _name;
    }
}
