package SelfStudyTasks;

import java.util.Scanner;

public class ArrayOfInputs {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int length = Input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Input.nextInt();
        }
        for (int j = 0; j < length; j++) {
            System.out.print(array[j] + " ");
        }
        Input.close();
    }
}
