package Assignment_2_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(i+j + " ");
                }
                System.out.println();
            }
        }
    }
