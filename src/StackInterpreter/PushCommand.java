package StackInterpreter;

public class PushCommand implements StackCommand {
    private StackCommand _operator;

    public PushCommand(StackCommand operator) {
        _operator = operator;
    }

    @Override
    public double execute(Context context) {
        return context.stackPush(_operator.execute(context));
    }
}
