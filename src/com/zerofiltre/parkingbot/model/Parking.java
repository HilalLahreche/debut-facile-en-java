package com.zerofiltre.parkingbot.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<Parking> subParkings = new ArrayList<>();
    Vehicle vehicle;
    int number;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public List<Parking> getSubParkings() {
        return subParkings;
    }

    public void setSubParkings(List<Parking> subParkings) {
        this.subParkings = subParkings;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingTypeEnum getType() {
        return type;
    }

    public void setType(ParkingTypeEnum type) {
        this.type = type;
    }

    ParkingTypeEnum type;


}
