package Assignment_2_2;

import java.util.Scanner;

public class Task_8 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            long number = input.nextInt();
            long result = cube(number);
            System.out.println("The cube of " + number + " is: " + result);
        }

        public static long cube(long number) {
            return number * number * number;
        }
    }

