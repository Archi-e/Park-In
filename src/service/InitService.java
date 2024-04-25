package service;

import model.*;
import model.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitService {
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("****************** Initialising Park-In ******************");
        Scanner sc = new Scanner(System.in);

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Park-In");
        Address parkingLotOneAddress = new Address("12A", "Indira Nagar", "Banglore", "India", "560035");
        parkingLot.setAddress(parkingLotOneAddress);
        parkingLot.setCapacity(5000);
        parkingLot.setSupportedVehicleType(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER, VehicleType.EV));

        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=1; i<=3; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPERATIONAL);
            List<ParkingSpot> parkingspots = new ArrayList<>();
            for(int j=1; j<10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                parkingSpot.setId((i*100) + j);
                parkingSpot.setSpotNumber(parkingSpot.getId());
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSpotRepository.put(parkingSpot);
                parkingspots.add(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingspots);

            Gate entryGate = new Gate();
            entryGate.setId((i*10) + 1);
            entryGate.setGateNumber(entryGate.getId());
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator(new Operator("Sia"));
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*10) + 2);
            exitGate.setGateNumber(exitGate.getId());
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperator(new Operator("Nicki"));
            gateRepository.put(exitGate);

            parkingFloor.setExitGate(exitGate);
            parkingFloor.setExtryGate(entryGate);

            parkingFloors.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);

        }
        parkingLot.setParkingFloorList(parkingFloors);
        parkingLotRepository.put(parkingLot);

//      System.out.println(parkingLotRepository.get(1));
        return parkingLotRepository.get(1);
    }


}
