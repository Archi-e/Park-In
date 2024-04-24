package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

public class Payment extends BaseModel{
    private String refNumber;
    private double amount;
    private PaymentStatus paymentStatus;
    private PaymentMode mode;

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
}
