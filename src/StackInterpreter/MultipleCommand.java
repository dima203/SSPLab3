package StackInterpreter;

public class MultipleCommand implements StackCommand {
    public MultipleCommand() { }

    @Override
    public double execute(Context context) {
        double result = context.stackPop() * context.stackPop();
        return context.stackPush(result);
    }
}
