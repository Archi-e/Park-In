package repository;

import model.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> TicketHashMap;
    public TicketRepository() {
        TicketHashMap = new HashMap<>();
    }

    private Ticket get(int id){
        return TicketHashMap.get(id);
    }

    private Ticket put(int id, Ticket ticket){
        TicketHashMap.put(id , ticket);
        return ticket;
    }

}
