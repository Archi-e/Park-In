package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

public class Payment extends BaseModel{
    private String refNumber;
    private double amount;
    private PaymentStatus paymentStatus;
    private PaymentMode mode;

}
