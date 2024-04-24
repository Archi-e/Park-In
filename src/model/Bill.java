package model;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private String billNumber;
    private LocalDateTime exitTime;
    private double amount;
    private Gate exitGate;
    private Payment payment;

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
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
}
