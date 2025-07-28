package dev.code.vehicle;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car("Porsche Taycan Turbo S", "Taycan Turbo S", 2025,
                4,5,100, 1200 );
        porsche.displayInfo();
        porsche.move();
        porsche.chargeBattery();

        System.out.println("_".repeat(50));


        Bus oectra = new Bus("Oectra Y2", "Y2", 2024, 6,
                40, "New Garden Hills", 90, 1200);
        oectra.displayInfo();

    }
}
