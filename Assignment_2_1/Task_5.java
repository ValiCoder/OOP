//You need to write a program that:
//        1. Reads an integer N from the console.
//2. If the read number N is greater than 0, the program further reads
//integers, the number of which is equal to N.
//        3. Output the read numbers to the console, if N is odd - in the input
//order, otherwise - in reverse order.
//Output each number on a new line. The number N does not need to be output.
//        Requirements:
//        • The program must read the number N followed by N more numbers.
//        • There should be a method public static void main(String[]) in the class.
//        • You cannot add new methods to the Solution class.
//        • The program should output the entered N numbers in reverse order if N is even.
//• The program should output the entered N numbers in the same order if N is
//odd

package Assignment_2_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int N = input.nextInt();
            if (N <= 0) {
                System.out.print("Unavaliable to produce such output");
                break;
            }

            int NumberRepetition = 0;
            boolean IsOdd = true;
            if (N % 2 == 0) {
                IsOdd = false;
            }
            int[] array = new int[N];

            for (int i = 0; i < N; i++) {
                array[i] = input.nextInt();
            }

            for (int j = 0; j < N; j++) {
                if (array[j] == N) {
                    NumberRepetition++;
                }
            }

            if (IsOdd) {
                for (int a = 0; a < N; a++) {
                    System.out.print(array[a] + " ");
                }
            } else {
                for (int b = (N - 1); b >= 0; b--) {
                    System.out.print(array[b] + " ");
                }
            }
        }
        input.close();
    }
}