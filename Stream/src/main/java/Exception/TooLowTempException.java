package Exception;

public class TooLowTempException extends RuntimeException{
    public TooLowTempException(String message) {
        super(message);
    }
}
