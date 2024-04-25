package controller;

import exception.InvalidExitGateException;
import model.Bill;
import model.Gate;
import model.Ticket;
import model.enums.GateType;
import service.BillService;

public class BillController {
    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public Bill getBill(Ticket ticket, Gate gate) {
        if(gate.getGateType().equals(GateType.ENTRY)){
            throw new InvalidExitGateException("Customer trying to exit from entry gate");
        }
       return billService.generateBill(ticket, gate);
    }
}
