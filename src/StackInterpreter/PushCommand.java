package StackInterpreter;

import StackInterpreter.Exeptions.WrongArgumentsCountException;

import java.util.LinkedList;

public class PushCommand implements StackCommand {
    private StackCommand _operand;

    public PushCommand(LinkedList<StackCommand> operands) {
        if (operands.size() != 1) {
            throw new WrongArgumentsCountException(String.format("PUSH expected 1 arguments, but %d given",
                    operands.size()));
        }
        _operand = operands.removeFirst();
    }

    @Override
    public double execute(Context context) {
        return context.stackPush(_operand.execute(context));
    }
}
