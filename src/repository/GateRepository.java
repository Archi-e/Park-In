package repository;

import exception.InvalidGateId;
import model.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> GateHashMap;
    private static int idCounter = 1;
    public GateRepository() {
        GateHashMap = new HashMap<>();
    }

    private Gate get(int id){
        if(GateHashMap.containsKey(id)){
            return GateHashMap.get(id);
        }
        else {
            throw new InvalidGateId("Gate ID is incorrect, please try again :( ");
        }
    }

    private Gate put( Gate gate){
        GateHashMap.put(idCounter++ , gate);
        return gate;
    }

}
