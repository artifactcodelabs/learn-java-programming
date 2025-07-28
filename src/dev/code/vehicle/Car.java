package dev.code.vehicle;

public class Car extends Vehicle implements Electric {
    private int battery;
    private int range;
    public Car(String make, String model, int year, int number_of_wheels, int number_of_seats, int battery, int range) {
        super(make, model, year, number_of_wheels, number_of_seats);
        this.battery = battery;
        this.range = range;
    }

    @Override
    public void chargeBattery() {
        System.out.println(getClass().getSimpleName() + " battery is getting charged");
    }

    @Override
    public int getBatteryLevel() {
        return this.battery;
    }

    @Override
    public int getRange() {
        return this.range;
    }

    @Override
    void move() {
        String model = this.getMake();
        if(model.equalsIgnoreCase( "porsche taycan turbo s" )) {
            System.out.println("this car " + model + " moves very fast");
        } else {
            System.out.println("this car " + model + " moves on average speed");
        }
    }

    @Override
    void displayInfo() {
        String report = String.format(
                "Vehicle Report:%n" + "_".repeat(30) +"%n" +
                        "Company Name: %s%n" +
                        "Passenger Capacity: %d%n" +
                        "Battery Level: %d%%%n" +
                        "Range: %d km%n",
                this.getMake(),
                this.getNumber_of_seats(),
                this.getBatteryLevel(),
                this.getRange()
        );
        System.out.println(report);
    }
}
