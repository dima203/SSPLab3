package StackInterpreter;

public class MinusCommand implements StackCommand {
    public MinusCommand() { }

    @Override
    public double execute(Context context) {
        double result = context.stackPop() - context.stackPop();
        return context.stackPush(result);
    }
}
