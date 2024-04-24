package service.spotAllocationStrategy;

import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;
import model.enums.ParkingFloorStatus;
import model.enums.ParkingSpotStatus;

public class OrderedSpotAllocation implements SpotAllocationStrategy{
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle) {
        for(ParkingFloor parkingFloor: parkingLot.getParkingFloorList()){
            if(parkingFloor.getParkingFloorStatus().equals(ParkingFloorStatus.OPERATIONAL)){
                for(ParkingSpot parkingSpot: parkingFloor.getParkingSpots()){
                    if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                    && parkingSpot.getVehicleType().equals(vehicle.getVehicleType())){
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
                        return parkingSpot;
                    }
                }
            }
        }
        return null;
    }
}
