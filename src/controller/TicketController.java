package controller;

import model.ParkingLot;
import model.Ticket;
import model.Vehicle;
import repository.TicketRepository;
import service.TicketService;
import service.spotAllocationStrategy.SpotAllocationStrategy;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(int parkingLotId,  int gateId, Vehicle vehicle){
        Ticket ticket = ticketService.generateTicket(parkingLotId, vehicle, gateId);
        return ticket;
    }
}
