package be.intecbrussel.foodshop.exception;

public class NotEnoughMoneyInRegisterException extends Exception{
    public NotEnoughMoneyInRegisterException() {
    }

    public NotEnoughMoneyInRegisterException(String message) {
        super(message);
    }

    public NotEnoughMoneyInRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughMoneyInRegisterException(Throwable cause) {
        super(cause);
    }

    public NotEnoughMoneyInRegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
