//It would be nice to have one method for solving different problems. You have the
//opportunity to write one.
//Create 9
//more universalMethod() methods. In total, you should have 10 of them.
//You can think up the parameters they should accept.
//        Requirements:
//        • The program must contain 10 methods named universalMethod.

package Assignment_2_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.print("Print any number: ");

        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        universalMethod1(x);
        universalMethod2(x);
        universalMethod3(x);

        System.out.println("What is your name?");
        input.nextLine();
        String name = input.nextLine();
        universalMethod4(name);

        universalMethod5(x);
        universalMethod6(x);
        universalMethod7(x);
        universalMethod8(x);
        universalMethod9(name);
        universalMethod10(name);

        input.close();
    }

    public static void universalMethod1(int x) {
        int squaredX = (x * x);
        System.out.println("Your number squared is equal to: " + squaredX);
    }

    public static void universalMethod2(int x) {
        double rootOfX = Math.sqrt(x);
        System.out.println("The square root of your number is: " + rootOfX);
    }

    public static void universalMethod3(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void universalMethod4(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void universalMethod5(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of your number is: " + factorial);
    }

    public static void universalMethod6(int x) {
        if (x % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }

    public static void universalMethod7(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to your number is: " + sum);
    }

    public static void universalMethod8(int x) {
        System.out.println("Multiplication table for " + x + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }

    public static void universalMethod9(String name) {
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println("Your name reversed is: " + reversedName);
    }

    public static void universalMethod10(String name) {
        String upperCaseName = name.toUpperCase();
        System.out.println("Your name in uppercase is: " + upperCaseName);
    }
}

