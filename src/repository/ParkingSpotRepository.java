package repository;

import exception.InvalidParkingSpotId;
import model.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private HashMap<Integer, ParkingSpot> ParkingSpotHashMap;
    private static int idCounter = 1;

    public ParkingSpotRepository() {
        ParkingSpotHashMap = new HashMap<>();
    }

    public ParkingSpot get(int id){
        if(ParkingSpotHashMap.containsKey(id)){
            return ParkingSpotHashMap.get(id);
        }
        else {
            throw new InvalidParkingSpotId("Parking Spot ID is incorrect, please try again :( ");
        }
    }

    public ParkingSpot put(int floorId, ParkingSpot parkingSpot){
        ParkingSpotHashMap.put(((floorId*1000)+idCounter) , parkingSpot);
        idCounter++;
        return parkingSpot;
    }

}
