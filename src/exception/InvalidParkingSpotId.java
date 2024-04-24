package exception;

public class InvalidParkingSpotId extends RuntimeException{
    public InvalidParkingSpotId(String message) {
        super(message);
    }
}
