package exception;

public class InvalidParkingLotId extends RuntimeException{
    public InvalidParkingLotId(String message) {
        super(message);
    }
}
