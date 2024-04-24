package service;

import exception.InvalidEntryGateException;
import exception.NoSpotAvailableException;
import model.*;
import model.enums.GateType;
import repository.*;
import service.spotAllocationStrategy.SpotAllocationStrategy;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private VehicleRepository vehicleRepository;
    private SpotAllocationStrategy spotAllocationStrategy;

    public TicketService(TicketRepository ticketRepository, GateRepository gateRepository, ParkingLotRepository parkingLotRepository, VehicleRepository vehicleRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket generateTicket(int parkingLotId, Vehicle vehicle,int gateId){
        Ticket ticket = new Ticket();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        Gate gate = gateRepository.get(gateId);

        if(gate.getGateType().equals(GateType.EXIT)){
            throw new InvalidEntryGateException("Customer trying to enter from exit gate!");
        }

        Vehicle newVehicle = vehicleRepository.get(vehicle.getId());
        vehicleRepository.put(vehicle.getId(), newVehicle);

        ParkingSpot parkingSpot = spotAllocationStrategy.assignSpot(parkingLot, vehicle);
        if(parkingSpot == null){
            throw new NoSpotAvailableException("Sorry, no spots are available at the moment");
        }

        ticket.setEntryGate(gate);
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        return ticket;
    }
}
