package StackInterpreter.Exeptions;

public class UndefinedParameterException extends RuntimeException {
    public UndefinedParameterException(String errorMessage) {
        super(errorMessage);
    }
}
