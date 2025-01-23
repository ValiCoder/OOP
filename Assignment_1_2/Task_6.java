//Let's write a program in which we need to enter integers from the keyboard and count their
//sum until the user enters the word "ENTER".
//Display the received amount and end the program.
//Requirements:
//        • The program must read data from the keyboard.
//        • It is necessary to calculate the sum of the entered integers and display it on the screen if the
//user has entered a stop word.
//        • The program must use a while loop.

package Assignment_1_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        int NumbersSum = 0;
        Scanner Number = new Scanner(System.in);
        String StopWord = "ENTER";
        String input;
        while (true) {
            input = Number.nextLine();

            if (input.equalsIgnoreCase(StopWord)) {
                break;
            }
            else {
                int num = Integer.parseInt(input);
                NumbersSum += num;
            }
        }
    System.out.println(NumbersSum);
        Number.close();
    }
}

