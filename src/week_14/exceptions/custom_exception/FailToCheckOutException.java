package week_14.exceptions.custom_exception;

public class FailToCheckOutException extends Exception{

    public FailToCheckOutException(String message) {
        super(message);
    }
}
