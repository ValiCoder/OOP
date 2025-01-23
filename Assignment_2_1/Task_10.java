//A two-dimensional array is an array of arrays, i.e. each of its cells contains a reference to some
//array. But it is much easier to represent it as a table with a number of rows (first dimension) and
//columns (second dimension). In this task, we will create such an array.
//To do this, implement the main(String[]) method, which:
//        1. Reads from the console a number N - the number of rows of the array (consider this
//number to be greater than 0, you can leave it unchecked).
//        2. Reads N numbers from the console (any numbers greater than 0 can be left unchecked).
//        3. Initializes a two-dimensional array multiArray:
//o the number of rows N;
//o strings - by arrays, the size of which corresponds to the numbers entered in item 2
//        (in the order of entry).


package Assignment_2_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        int[][] multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            multiArray[i] = new int[array[i]];
        }
        for (int a = 0; a < N; a++) {
            for (int j = 0; j < multiArray[a].length; j++) {
            System.out.print("[]");
            }
        System.out.println();
        }
    input.close();
    }
}