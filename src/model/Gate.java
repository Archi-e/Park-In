package model;

import model.enums.GateStatus;
import model.enums.GateType;

public class Gate extends BaseModel{
    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private Operator operator;
}
