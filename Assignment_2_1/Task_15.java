//The Solution class contains a two-dimensional array of integers (array field) of dimension 3x3. It
//is necessary:
//        • fill this array line by line with numbers from the keyboard;
//• flip the array with respect to the main diagonal (the main diagonal has the i == j
//        property);
//• display the inverted array on the screen as in the example - each line separately, elements
//in the line separated by a space.
//An example of array flipping.
//Original array:
//        1 2 3
//        4 5 6
//        7 8 9
//Array flipped with respect to the main diagonal:
//        1 4 7
//        2 5 8
//        3 6 9
//Requirements:
//        • The program needs to read 9 numbers from the keyboard.
//        • The array array must be inverted with respect to the main diagonal.
//        • In the program you need to output the elements of the array according to the
//condition.


package Assignment_2_1;

import java.util.Scanner;

public class Task_15 {
    static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) array[i][j] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}