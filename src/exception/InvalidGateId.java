package exception;

public class InvalidGateId extends RuntimeException{
    public InvalidGateId(String message) {
        super(message);
    }
}
