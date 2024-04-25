package service.billCalculationStartegy;

import model.Bill;
import model.Gate;
import model.Ticket;
import model.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{

    @Override
    public Bill generateBill(Ticket ticket, Gate exitGate) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long noOfSeconds = ChronoUnit.SECONDS.between(entryTime, exitTime);
        double amount = 5 * noOfSeconds;
        Bill bill = new Bill();
        bill.setBillNumber(Math.abs(exitTime.hashCode()));
        bill.setId(exitTime.hashCode());
        bill.setAmount(amount);
        bill.setExitGate(exitGate);
        bill.setExitTime(LocalDateTime.now());
        bill.setBillStatus(BillStatus.UNPAID);
        return bill;
    }
}
