package repository;

import model.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> TicketHashMap;
    public TicketRepository() {
        TicketHashMap = new HashMap<>();
    }

    public Ticket get(int id){
        return TicketHashMap.get(id);
    }

    public Ticket put(Ticket ticket){
        TicketHashMap.put(ticket.getId(), ticket);
        return ticket;
    }

}
