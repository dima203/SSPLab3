package StackInterpreter;

import StackInterpreter.Exeptions.WrongArgumentsCountException;

import java.util.LinkedList;

public class DefineCommand implements StackCommand {
    private ParameterCommand _operand1;
    private StackCommand _operand2;

    public DefineCommand(LinkedList<StackCommand> operands) {
        if (operands.size() != 2) {
            throw new WrongArgumentsCountException(String.format("DEFINE expected 2 arguments, but %d given",
                    operands.size()));
        }
        _operand1 = (ParameterCommand) operands.removeLast();
        _operand2 = operands.removeLast();
    }

    @Override
    public double execute(Context context) {
        return context.assignParameter(_operand1.getName(), _operand2.execute(context));
    }

    public String toString() {
        return "Define(" + _operand1.toString() + ", " + _operand2.toString() + ")";
    }
}
