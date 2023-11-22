package StackInterpreter;

public class MinusCommand implements StackCommand {
    private StackCommand _operator1;
    private StackCommand _operator2;

    public MinusCommand(StackCommand operator1, StackCommand operator2) {
        _operator1 = operator1;
        _operator2 = operator2;
    }

    @Override
    public double execute(Context context) {
        return _operator1.execute(context) - _operator2.execute(context);
    }
}