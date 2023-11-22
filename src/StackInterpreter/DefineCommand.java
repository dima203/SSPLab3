package StackInterpreter;

public class DefineCommand implements StackCommand {
    private ParameterCommand _operand1;
    private StackCommand _operand2;

    public DefineCommand(ParameterCommand operand1, StackCommand operand2) {
        _operand1 = operand1;
        _operand2 = operand2;
    }

    @Override
    public double execute(Context context) {
        return context.assignParameter(_operand1.getName(), _operand2.execute(context));
    }
}
