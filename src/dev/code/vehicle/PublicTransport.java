package dev.code.vehicle;

public interface PublicTransport {
    int getCapacity();                // Passenger capacity
    void boardPassenger();            // Load a passenger
    void alightPassenger();           // Unload a passenger
    String getRoute();                // Route information
}
