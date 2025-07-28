package dev.code.vehicle;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private int number_of_wheels;
    private int number_of_seats;
    private String fuelType;

    public Vehicle(String make, String model, int year, int number_of_wheels, int number_of_seats) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.number_of_wheels = number_of_wheels;
        this.number_of_seats = number_of_seats;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    abstract void move();
    abstract void displayInfo();


}
