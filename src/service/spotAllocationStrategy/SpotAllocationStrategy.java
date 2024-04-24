package service.spotAllocationStrategy;

import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle);
}
