package StackInterpreter;

public class SqrtCommand implements StackCommand {
    public SqrtCommand() { }

    @Override
    public double execute(Context context) {
        double result = Math.sqrt(context.stackPop());
        return context.stackPush(result);
    }
}
