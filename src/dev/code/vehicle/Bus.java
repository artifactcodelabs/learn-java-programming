package dev.code.vehicle;

public class Bus extends Vehicle implements PublicTransport, Electric {
    private String destination;
    private int batteryLevel;
    private int range;
    public Bus(String make, String model, int year, int number_of_wheels, int number_of_seats, String destination, int batteryLevel, int range) {
        super(make, model, year, number_of_wheels, number_of_seats);
        this.destination = destination;
        this.batteryLevel = batteryLevel;
        this.range = range;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public int getCapacity() {
        return this.getNumber_of_seats();
    }

    @Override
    public void boardPassenger() {
        System.out.println("Boarding started");
    }

    @Override
    public void alightPassenger() {
        System.out.println("Destination reached");
    }

    @Override
    public String getRoute() {
        return "Going to Destination " + this.destination;
    }

    @Override
    public void chargeBattery() {
        System.out.println(getClass().getSimpleName() + " battery is getting charged");
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public int getRange() {
        return this.range;
    }

    @Override
    void move() {
        System.out.println("Bus is moving slow");
    }

    @Override
    void displayInfo() {
        String report = String.format(
                "=== Bus Report ===%n" +
                        "Company Name     : %s%n" +
                        "Cargo Capacity   : %d kg%n" +
                        "Route            : %s%n" +
                        "Passenger Capacity: %d%n" +
                        "Battery Level    : %d%%%n" +
                        "Range Remaining  : %d km%n",
                this.getMake(),
                this.getCapacity(),
                getRoute(),
                getCapacity(),
                getBatteryLevel(),
                getRange()
        );
        System.out.println(report);
    }
}
