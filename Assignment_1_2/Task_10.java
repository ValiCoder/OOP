//In the main method, 3 integers are read from the keyboard: start, end (start <= end), multiple.
//Add a program so that the sum of numbers from start (inclusive) to end (not inclusive),
//multiples of multiple, is displayed on the screen.
//        To do this, use a for loop.
//        Hint: To move to the next iteration of a loop, use the continue statement.
//        Requirements:
//        • The program should print to the console the sum of numbers from start (inclusive) to end
//(not inclusive), multiples of multiple.
//• The program must use a for loop.
//• A continue statement must be used in a for loop.

package Assignment_1_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Start = Input.nextInt();
        int End = Input.nextInt();
        int Multiple = Input.nextInt();
        int Sum = 0;
        for (int i = Start; i < End; i++) {
            if (i % Multiple == 0){
                Sum+=i;
            }
        }
    System.out.println(Sum);
    }
}
