package StackInterpreter;

public class PlusCommand implements StackCommand {
    public PlusCommand() { }

    @Override
    public double execute(Context context) {
        double result = context.stackPop() + context.stackPop();
        return context.stackPush(result);
    }

    public String toString() {
        return "+";
    }
}
