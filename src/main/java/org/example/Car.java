package org.example;

public class Car extends Vehicle {
    private boolean fourWheelDrive;

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public int calculateBill() {
        return isFourWheelDrive() ? 200 : 100;
    }

    public int calculateTotalCost() {
        return calculateBill() + calculateInsurance();
    }
}