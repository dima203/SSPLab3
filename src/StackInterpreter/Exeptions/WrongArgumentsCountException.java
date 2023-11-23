package StackInterpreter.Exeptions;

public class WrongArgumentsCountException extends RuntimeException {
    public WrongArgumentsCountException(String errorMessage) {
        super(errorMessage);
    }
}
