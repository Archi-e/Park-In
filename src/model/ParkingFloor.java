package model;

import model.enums.ParkingFloorStatus;
import model.enums.ParkingSpotStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;
    private List<Gate> gates;
    private List<ParkingSpot> parkingSpots;
}
