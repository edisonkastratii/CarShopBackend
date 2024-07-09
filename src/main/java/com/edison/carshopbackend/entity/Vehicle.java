package com.edison.carshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;

    private String vehicleType;

    private String vehicleMake;

    private String vehicleModel;

    private long vehicleFirstRegistrationDate;

    private long vehicleKmPassed;

    private long vehiclePrice;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public long getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(long vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public long getVehicleKmPassed() {
        return vehicleKmPassed;
    }

    public void setVehicleKmPassed(long vehicleKmPassed) {
        this.vehicleKmPassed = vehicleKmPassed;
    }

    public long getVehicleFirstRegistrationDate() {
        return vehicleFirstRegistrationDate;
    }

    public void setVehicleFirstRegistrationDate(long vehicleFirstRegistrationDate) {
        this.vehicleFirstRegistrationDate = vehicleFirstRegistrationDate;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
