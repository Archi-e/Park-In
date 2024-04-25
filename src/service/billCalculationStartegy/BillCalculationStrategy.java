package service.billCalculationStartegy;

import model.Bill;
import model.Gate;
import model.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket, Gate gate);
}
