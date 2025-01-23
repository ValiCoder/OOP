package Assignment_2_1;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Height = input.nextInt();
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i * 2); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

