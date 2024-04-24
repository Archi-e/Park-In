package model;

import model.enums.VehicleType;

public class Vehicle extends BaseModel{
    private String Vehicle_number;
    private String color;
    private VehicleType vehicleType;

    public String getVehicle_number() {
        return Vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        Vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
