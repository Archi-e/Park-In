package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private Gate entryGate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("************ TICKET DETAILS: ************\n" +
                        "Ticket ID: %d\n" +
                        "Entry Time: %s\n" +
                        "Entry Gate: %d\n" +
                        "Vehicle Number: %s\n" +
                        "Parking Spot: %d\n",
                this.getId(), entryTime.format(formatter), entryGate.getGateNumber(), vehicle.getVehicle_number(), parkingSpot.getSpotNumber());

    }

}
