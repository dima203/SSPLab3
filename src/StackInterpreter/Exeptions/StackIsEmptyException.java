package StackInterpreter.Exeptions;

public class StackIsEmptyException extends RuntimeException{
    public StackIsEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
