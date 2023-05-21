package week_14.exceptions.custom_exception;

public class NonResidentException extends RuntimeException{

    public NonResidentException(String message) {
        super(message);
    }
}
