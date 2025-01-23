//Rename the parameters of the printPersonInfo() method:
//        • name to name;
//• surame to surname;
//• The meal in the meal;
//so that the program functionality remains unchanged.
//Leave the names of variables in the main() method unchanged.
//Requirements:
//        • The parameters of the printPersonInfo() method must be named name, surname,
//and meal.
//        • The output to the console must match the task condition.
//        • In the main() method, the variables name, surame, meal should
//remain unchanged.

package Assignment_2_2;

public class Task_3 {
        public static void main(String[] args) {
            String navigator = "John";
            String pilot = "Gender";
            String secondPilot = "George";
            String flightEngineer = "Ringo";
            createCrew(navigator, pilot, secondPilot, flightEngineer);
        }

        public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
            System.out.println("The four to conquer space:");
            System.out.println("Navigator: " + navigator);
            System.out.println("Pilot: " + pilot);
            System.out.println("Co-pilot: " + secondPilot);
            System.out.println("Flight Engineer: " + flightEngineer);
        }
    }


