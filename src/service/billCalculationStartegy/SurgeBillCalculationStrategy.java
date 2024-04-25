package service.billCalculationStartegy;

import model.Bill;
import model.Gate;
import model.Ticket;
import model.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SurgeBillCalculationStrategy implements BillCalculationStrategy{
    @Override
    public Bill generateBill(Ticket ticket, Gate exitGate) {
        double surgeCharges = 5.8;
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long noOfSeconds = ChronoUnit.SECONDS.between(exitTime, entryTime);
        double amount = 5 * noOfSeconds * surgeCharges;
        Bill bill = new Bill();
        bill.setBillNumber(exitTime.hashCode());
        bill.setId(exitTime.hashCode());
        bill.setAmount(amount);
        bill.setExitGate(exitGate);
        bill.setBillStatus(BillStatus.UNPAID);
        return bill;
    }
}
