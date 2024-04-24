package repository;

import exception.InvalidParkingFloorId;
import model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> ParkingFloorHashMap;
    private static int idCounter = 0;

    public ParkingFloorRepository() {
        ParkingFloorHashMap = new HashMap<>();
    }

    private ParkingFloor get(int id){
        if(ParkingFloorHashMap.containsKey(id)){
            return ParkingFloorHashMap.get(id);
        }
        else {
            throw new InvalidParkingFloorId("Parking Floor ID is incorrect, please try again :( ");
        }
    }

    private ParkingFloor put(ParkingFloor parkingFloor){
        ParkingFloorHashMap.put(idCounter++, parkingFloor);
        return parkingFloor;
    }

}
