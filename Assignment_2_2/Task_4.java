//The createCrew() method outputs the positions and names of the crew members of a
//spaceship.
//To avoid confusion within the method, change the names of the createCrew() parameters
//to match the names of the variables that are passed to the method:
//        • name1 in navigator
//• name2 in pilot
//• name3 to secondPilot
//• name4 in flightEngineer
//The result of the program execution should not change.
//        Requirements:
//        • The parameters of the createCrew() method must be named navigator, pilot,
//secondPilot and flightEngineer.
//• The output in the console must match the task condition.
//        • In the main() method, the navigator, pilot, secondPilot and flightEngineer variables
//should remain unchanged.

package Assignment_2_2;

public class Task_4 {
    public static void main(String[] args) {

        String navigator = "John Doe";
        String pilot = "Alice Smith";
        String secondPilot = "Bob Johnson";
        String flightEngineer = "Eve Davis";

        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }
    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second Pilot: " + secondPilot);
        System.out.println("Flight Engineer: " + flightEngineer);
    }
}
