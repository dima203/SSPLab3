package StackInterpreter;

public class DivideCommand implements StackCommand {
    public DivideCommand() { }

    @Override
    public double execute(Context context) {
        double result = context.stackPop() / context.stackPop();
        return context.stackPush(result);
    }

    public String toString() {
        return "/";
    }
}
