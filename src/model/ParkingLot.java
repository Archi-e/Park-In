package model;

import service.billCalculationStartegy.BillCalculationStrategy;
import service.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private Address address;
    private int capacity;
    private List<ParkingFloor> parkingFloorList;
    private List<ParkingSpot> parkingSpotList;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

}
