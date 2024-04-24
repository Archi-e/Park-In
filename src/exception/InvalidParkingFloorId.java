package exception;

public class InvalidParkingFloorId extends RuntimeException{
    public InvalidParkingFloorId(String message) {
        super(message);
    }
}
