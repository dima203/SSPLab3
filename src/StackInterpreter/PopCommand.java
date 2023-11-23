package StackInterpreter;

public class PopCommand implements StackCommand {
    public PopCommand() { }

    @Override
    public double execute(Context context) {
        return context.stackPop();
    }

    public String toString() {
        return "POP";
    }
}
