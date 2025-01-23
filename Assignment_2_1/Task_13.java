//The Solution class contains a two-dimensional array of integers (array field) of size
//3x3. In the main method you need to fill this array line by line with data from the
//keyboard and display the maximum element of the array.
//        Requirements:
//        • The program needs to read 9 numbers from the keyboard.
//        • The array array must be filled with numbers entered from the keyboard.
//        • In the program, you need to display the maximum element of an array on the
//screen.
//import java.util.Scanner;
///*
//Maximum element
//*/
//public class Solution {

package Assignment_2_1;

import java.util.Scanner;

public class Task_13 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = input.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Maximum element: " + max);
        input.close();
    }
}
