package repository;

import exception.InvalidParkingFloorId;
import model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> ParkingFloorHashMap;

    public ParkingFloorRepository() {
        ParkingFloorHashMap = new HashMap<>();
    }

    public ParkingFloor get(int id){
        if(ParkingFloorHashMap.containsKey(id)){
            return ParkingFloorHashMap.get(id);
        }
        else {
            throw new InvalidParkingFloorId("Parking Floor ID is incorrect, please try again :( ");
        }
    }

    public ParkingFloor put(ParkingFloor parkingFloor){
        ParkingFloorHashMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

}
