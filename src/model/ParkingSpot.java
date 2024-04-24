package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;
    private Vehicle vehicle;

}
