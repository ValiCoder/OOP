//Let's write a program that will read age from the keyboard. If the age is from 20 to 60
//        (inclusive), then you do not need to display anything, otherwise, display the phrase “you
//don’t have to work.” This can (and should!) be done using only one if statement without else.
//Hint: use the logical operator "||" (or).
//Requirements:
//        • The program must read one number from the keyboard.
//• If the age is less than 20 or more than 60, then you need to display the phrase “you don’t
//have to work.”
//        • If the age is in the range from 20 to 60 (inclusive), then nothing needs to be displayed.
//        • The program must use one if statement without else and the logical operator ||.

package Assignment_1_2;

import java.util.Scanner;

public class Task_4 {
    public  static  void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner myObj = new Scanner(System.in);
        int Age = myObj.nextInt();

        if (Age < 20 || Age > 60) {
            System.out.println("You don't have to work");
        }
        myObj.close();
    }
}
