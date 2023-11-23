package StackInterpreter;

public class NumberCommand implements StackCommand {
    private final double _number;

    public NumberCommand(double number) {
        _number = number;
    }

    @Override
    public double execute(Context context) {
        return _number;
    }

    public String toString() {
        return String.format("%f", _number);
    }
}
