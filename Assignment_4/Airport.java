package Assignment_4;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private String name;
    private List<Aircraft> aircraftVehicles;

    public Airport(String name) {
        this.name = name;
        this.aircraftVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircraftVehicles() {
        return aircraftVehicles;
    }

    public void addAircraft(Aircraft aircraft) {
        if (!aircraftVehicles.contains(aircraft)) {
            aircraftVehicles.add(aircraft);
            System.out.println("Aircraft " + aircraft.getName() + " added to " + this.name);
        }
    }

    public void removeAircraft(Aircraft aircraft) {
        aircraftVehicles.remove(aircraft);
        System.out.println("Aircraft " + aircraft.getName() + " removed from " + this.name);
    }

    public Passenger searchPassengerByAircraftAndSeat(String aircraftName, int seatNumber) {
        for (Aircraft aircraft : aircraftVehicles) {
            if (aircraft.getName().equals(aircraftName)) {
                for (Passenger passenger : aircraft.getPassengers()) {
                    if (passenger.getSeatNumber() == seatNumber) {
                        return passenger;
                    }
                }
            }
        }
        return null;
    }
}