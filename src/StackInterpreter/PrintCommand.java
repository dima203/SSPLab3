package StackInterpreter;

public class PrintCommand implements StackCommand {
    public PrintCommand() { }

    @Override
    public double execute(Context context) {
        double buffer = context.stackPop();
        System.out.println(buffer);
        return context.stackPush(buffer);
    }

    public String toString() {
        return "PRINT";
    }
}
