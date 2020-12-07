package be.intecbrussel.gameshop.exception;

public class TooYoungToGameException extends Exception{

    public TooYoungToGameException() {
    }

    public TooYoungToGameException(String message) {
        super(message);
    }

    public TooYoungToGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooYoungToGameException(Throwable cause) {
        super(cause);
    }

    public TooYoungToGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
