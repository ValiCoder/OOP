//The program reads the body temperature value from the keyboard and displays a message
//indicating that the body temperature is high, low or normal, depending on the conditions.
//The class declares two Boolean variables isHigh (high temperature) and isLow (low), into
//which you need to put the corresponding conditions and use these variables instead of
//comparison expressions.
//Requirements:
//        • The program must read the temperature value from the keyboard.
//        • Do not change the declaration of the isHigh and isLow variables.
//• The variables isHigh and isLow in the main method must be assigned appropriate
//comparison expressions.
//        • The variables isHigh and isLow should be used instead of comparison expressions in if()
//statements.
//• The functionality of the program should not change.


package Assignment_1_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        float Temperature = myObj.nextFloat();
        boolean isHigh = false;
        boolean isLow = false;
        if (Temperature > 36.6) {
            isHigh = true;
            isLow = false;
        } else if (Temperature < 36.6) {
            isHigh = false;
            isLow = true;
        }
        if (isHigh){
            System.out.println("The temperature is high");
        } else if (isLow) {
            System.out.println("The temperature is low");
        }
        else {
            System.out.println("The temperature is normal");
        }
        myObj.close();
    }
}


//package Assignment_2;
//
//import java.util.Scanner;
//
//public class Task_3 {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        float Temperature = myObj.nextFloat();
//        boolean isHigh = false;
//        boolean isLow = false;
//
//        if (Temperature > 36.6) {
//            isHigh = true;
//        } else if (Temperature < 36.6) {
//            isLow = true;
//        }
//
//        if (isHigh) {
//            System.out.println("The temperature is high");
//        } else if (isLow) {
//            System.out.println("The temperature is low");
//        } else {
//            System.out.println("The temperature is normal");
//        }
//
//        myObj.close();
//    }
//}

