package model;

import model.enums.ParkingFloorStatus;
import model.enums.ParkingSpotStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;
    private Gate extryGate;
    private Gate exitGate;
    private List<ParkingSpot> parkingSpots;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public Gate getExtryGate() {
        return extryGate;
    }

    public void setExtryGate(Gate extryGate) {
        this.extryGate = extryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
