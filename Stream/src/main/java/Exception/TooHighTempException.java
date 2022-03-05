package Exception;

public class TooHighTempException extends RuntimeException{
    public TooHighTempException(String message) {
        super(message);
    }
}
