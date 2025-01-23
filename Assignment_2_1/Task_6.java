package Assignment_2_1;

import java.util.Scanner;

public class Task_6 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int N = input.nextInt();
            int[] array = new int[N];
            for (int a = 0; a < N; a++) {
                array[a] = input.nextInt();
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < N - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            for (int k = 0; k < N; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println(" ");
            System.out.print(array[N-1]);
        input.close();
        }
    }

