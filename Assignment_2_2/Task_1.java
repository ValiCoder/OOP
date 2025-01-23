//The main method outputs too many lines of information about different concepts.
//It would be logical to separate the output of information about hydrogen and Java into
//different methods.
//Create a public static void printHydrogenInfo() method that should print all the strings
//about hydrogen.
//Also create a public static void printJavaInfo() method that should print all strings about
//Java Island.
//Finally, in the main() method, call these two methods. The
//overall output in the console should not change.
//Requirements:
//        • There must be a public static void printHydrogenInfo() method.
//        • There must be a public static void printJavaInfo() method.
//        • The printHydrogenInfo() method should output all existing rows about hydrogen.
//        • The printJavaInfo() method should output all existing strings about Java.
//        • The printHydrogenInfo() and printJavaInfo() methods must be called in the main()
//method.
//6
//        • The overall output in the console should not change.


package Assignment_2_2;

public class Task_1 {
    public static void printHydrogenInfo() {
        System.out.println("Hydrogen:");
        System.out.println("This is a chemical element of the periodic system with the designation H and atomic number 1.");
        System.out.println("Is the lightest element in the table.");
        System.out.println("Hydrogen is used in:");
        System.out.println("-Chemical industry;");
        System.out.println("-Oil refining industry;");
        System.out.println("-Aviation;");
        System.out.println("-Electricity.");
    }
    public static void printJavaInfo() {
        System.out.println("Java Island:");
        System.out.println("Included in Indonesia.");
        System.out.println("The states of Mataram, Majapahit, Demak originated on the island.");
        System.out.println("Java is the most populated island in the world:");
        System.out.println("The total population is 140 million people.");
        System.out.println("Population density - 1061 people/km²");
        System.out.println("One of the famous varieties of coffee, Kopi Luwak, is produced here.");
    }

    public static void main(String[] args) {
        printHydrogenInfo();
        System.out.println();
        printJavaInfo();
    }
}

