package com.zerofiltre.parkingbot.model;

import java.util.Date;

public class Ticket {

    private double  amount;
    private Vehicle vehicle;
    private Date enteringTime;
    private Date exitTime;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
       return "Ticket d'un montant de :" +amount+ " € pour véhicule de type " + vehicle.getCategory() + " immatriculé: " +vehicle.getRegistrationNumber()+ " entré à " + enteringTime + " et sorti à " + exitTime;

    }
}
