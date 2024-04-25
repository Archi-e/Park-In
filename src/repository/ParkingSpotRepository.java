package repository;

import exception.InvalidParkingSpotId;
import model.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private HashMap<Integer, ParkingSpot> ParkingSpotHashMap;

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

    public ParkingSpot put(ParkingSpot parkingSpot){
        ParkingSpotHashMap.put(parkingSpot.getId() , parkingSpot);
        return parkingSpot;
    }

}
