package model;

import model.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill extends BaseModel{
    private int billNumber;
    private LocalDateTime exitTime;
    private double amount;
    private Gate exitGate;
    private BillStatus billStatus;
    private Payment payment;

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return String.format("************ BILL DETAILS: ************\n" +
                        "Bill Number: %d\n" +
                        "Exit Time: %s\n" +
                        "Amount: %.2f\n" +
                        "Exit Gate: %d\n" +
                        "Bill Status: %s",
                billNumber, exitTime.format(formatter), amount, exitGate.getGateNumber(), billStatus);
    }
}
