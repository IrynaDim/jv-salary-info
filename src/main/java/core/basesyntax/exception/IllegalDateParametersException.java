package core.basesyntax.exception;

public class IllegalDateParametersException extends RuntimeException {
    public IllegalDateParametersException(String errorMessage) {
        super(errorMessage);
    }
}
