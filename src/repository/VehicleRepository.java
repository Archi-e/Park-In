package repository;

import model.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<String, Vehicle> VehicleHashMap;

    public VehicleRepository() {
        VehicleHashMap = new HashMap<>();
    }

    public Vehicle get(int id){
        return VehicleHashMap.get(id);
    }

    public Vehicle put(Vehicle vehicle){
        VehicleHashMap.put(vehicle.getVehicle_number(),  vehicle);
        return vehicle;
    }

}
