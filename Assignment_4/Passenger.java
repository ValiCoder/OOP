package Assignment_4;

class Passenger {
    private String name;
    private int seatNumber;
    private Aircraft aircraft;

    public Passenger(String name, int seatNumber, Aircraft aircraft) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.aircraft = aircraft;
        aircraft.addPassenger(this);
    }

    public String getName() {
        return name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }
}