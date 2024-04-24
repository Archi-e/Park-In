package repository;

import model.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> VehicleHashMap;

    public VehicleRepository() {
        VehicleHashMap = new HashMap<>();
    }

    public Vehicle get(int id){
        return VehicleHashMap.get(id);
    }

    public Vehicle put(int id, Vehicle vehicle){
        VehicleHashMap.put(id , vehicle);
        return vehicle;
    }

}
