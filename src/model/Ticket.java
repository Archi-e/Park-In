package model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private Gate entryGate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
