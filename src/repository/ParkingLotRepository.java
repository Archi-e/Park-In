package repository;

import exception.InvalidParkingLotId;
import model.ParkingLot;
import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotHashMap;
    private static int idCounter = 0;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
    }

    public ParkingLot get(int id){
        if(parkingLotHashMap.containsKey(id)){
            return parkingLotHashMap.get(id);
        }
        else {
            throw new InvalidParkingLotId("Parking Lot id is incorrect, please try again :( ");
        }
    }

    public ParkingLot put(ParkingLot parkingLot){
        parkingLotHashMap.put(idCounter++, parkingLot);
        return parkingLot;
    }

}
