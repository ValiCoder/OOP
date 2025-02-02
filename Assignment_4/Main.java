package Assignment_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Airport airport = new Airport("Astana International");
//
//        Aircraft aircraft1 = new Aircraft("Broiler 747", 2, airport);
//        Aircraft aircraft2 = new Aircraft("Arbuz B320", 3, airport);
//
//        Passenger p1 = new Passenger("Valeriy", 1, aircraft1);
//        Passenger p2 = new Passenger("Zhanassyl", 2, aircraft2);
//        Passenger p3 = new Passenger("Sasha", 3, aircraft2);
//
//        System.out.println("Passengers on " + aircraft2.getName() + ":");
//        for (Passenger p : aircraft2.getPassengers()) {
//            System.out.println("- " + p.getName() + " (Seat: " + p.getSeatNumber() + ")");
//        }
//
//        Passenger searchedPassenger = airport.searchPassengerByAircraftAndSeat("Airbus A320", 2);
//        if (searchedPassenger != null) {
//            System.out.println("Found Passenger: " + searchedPassenger.getName());
//        } else {
//            System.out.println("Passenger not found.");
//        }

        Scanner input = new Scanner(System.in);
        Airport airport = new Airport("Astana International");

        System.out.println("Welcome to the Airport Management System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an Aircraft");
            System.out.println("2. Assign an Aircraft to an Airport");
            System.out.println("3. Add a Passenger to an Aircraft");
            System.out.println("4. Display all Aircrafts at Airport");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Aircraft Name: ");
                    String aircraftName = input.nextLine();
                    System.out.print("Enter Max Passengers: ");
                    int maxPassengers = input.nextInt();
                    input.nextLine(); // Consume the newline
                    Aircraft newAircraft = new Aircraft(aircraftName, maxPassengers, airport);
                    System.out.println("Aircraft " + aircraftName + " added successfully!");
                    break;

                case 2:
                    System.out.println("Assigning all aircraft to " + airport.getName() + "...");
                    for (Aircraft a : airport.getAircraftVehicles()) {
                        System.out.println(a.getName() + " assigned.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Passenger Name: ");
                    String passengerName = input.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNumber = input.nextInt();
                    input.nextLine();

                    if (airport.getAircraftVehicles().isEmpty()) {
                        System.out.println("No aircraft available! Please add an aircraft first.");
                        break;
                    }

                    System.out.println("Available Aircrafts:");
                    for (int i = 0; i < airport.getAircraftVehicles().size(); i++) {
                        System.out.println((i + 1) + ". " + airport.getAircraftVehicles().get(i).getName());
                    }
                    System.out.print("Select an Aircraft (Enter Number): ");
                    int aircraftChoice = input.nextInt();
                    input.nextLine(); // Consume newline

                    if (aircraftChoice < 1 || aircraftChoice > airport.getAircraftVehicles().size()) {
                        System.out.println("Invalid choice.");
                        break;
                    }

                    Aircraft selectedAircraft = airport.getAircraftVehicles().get(aircraftChoice - 1);
                    Passenger newPassenger = new Passenger(passengerName, seatNumber, selectedAircraft);
                    System.out.println("Passenger " + passengerName + " added to " + selectedAircraft.getName() + ".");
                    break;

                case 4:
                    System.out.println("Aircrafts at " + airport.getName() + ":");
                    for (Aircraft a : airport.getAircraftVehicles()) {
                        System.out.println("- " + a.getName());
                    }
                    break;

                case 5:
                    System.out.println("Exiting Airport Management System.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}