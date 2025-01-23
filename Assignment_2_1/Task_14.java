//The Solution class contains a two-dimensional array of integers (array field) of size
//3x3. In the main method you need to fill this array line by line with data from the
//keyboard, calculate the sum of elements in each column and in each row and display
//the smallest of these sums on the screen.
//Requirements:
//        • The program needs to read 9 numbers from the keyboard.
//        • The array array must be filled with numbers entered from the keyboard.
//        • In the program, you need to display the minimum sum of elements in a row or
//column.

package Assignment_2_1;

import java.util.Scanner;

public class Task_14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int minSumRow = 0;
        int minSumCol = 0;
        int minRow = -1;
        int minCol = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            rowSum[i] = 0;
            for (int j = 0; j < 3; j++) {
                rowSum[i] += array[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + " is " + rowSum[i]);
        }

        for (int j = 0; j < 3; j++) {
            colSum[j] = 0;
            for (int i = 0; i < 3; i++) {
                colSum[j] += array[i][j];
            }
            System.out.println("The sum of column " + (j + 1) + " is " + colSum[j]);
        }

        minSumRow = rowSum[0];
        minRow = 0;
        for (int i = 1; i < 3; i++) {
            if (rowSum[i] < minSumRow) {
                minSumRow = rowSum[i];
                minRow = i;
            }
        }

        minSumCol = colSum[0];
        minCol = 0;
        for (int j = 1; j < 3; j++) {
            if (colSum[j] < minSumCol) {
                minSumCol = colSum[j];
                minCol = j;
            }
        }
        int absoluteMin = 0;

        for (int i = 0; i < 3; i++) {
            if (minSumCol < minSumRow){
             absoluteMin = minSumCol;
            }
            else {
                absoluteMin = minSumRow;
            }
        }

        System.out.println("The minimum row sum is in row " + (minRow + 1) + " and is equal to: " + minSumRow);
        System.out.println("The minimum column sum is in column " + (minCol + 1) + " and is equal to: " + minSumCol);
        System.out.println("The minimal value among sums of rows and columns is equal to: " + absoluteMin);

        input.close();
    }
}
