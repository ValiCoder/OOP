
//Enter the outside temperature using the keyboard. If the temperature is less than 0, display
//the inscription “it’s cold outside,” otherwise, display the inscription “it’s warm outside.”
//Requirements:
//        • The program must read the temperature value from the keyboard.
//        • The program must use the System.out.println() or System.out.print() command.
//        • If the temperature is less than 0, display only the message “it’s cold outside.”
//        • If the temperature is greater than or equal to 0, display only the message “it’s warm
//outside.”



package Assignment_1_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int Temperature = myObj.nextInt();
        if (Temperature < 0) {
            System.out.println("It's cold outside");
        }
        else {
            System.out.println("It's warm outside");
        }
        myObj.close();
    }
}

