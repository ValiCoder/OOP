package Assignment_4;

import java.util.ArrayList;
import java.util.List;

class Aircraft {
    private String name;
    private int maxPassengers;
    private Airport airport;
    private List<Passenger> passengers;

    public Aircraft(String name, int maxPassengers, Airport airport) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.airport = airport;
        this.passengers = new ArrayList<>();
        airport.addAircraft(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public Airport getAirport() {
        return airport;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
            System.out.println("Passenger " + passenger.getName() + " added to " + name);
        } else {
            System.out.println("Aircraft " + name + " is full!");
        }
    }
}
