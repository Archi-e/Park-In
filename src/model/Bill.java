package model;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private String billNumber;
    private LocalDateTime exitTime;
    private double amount;
    private Gate exitGate;
    private Payment payment;

}
