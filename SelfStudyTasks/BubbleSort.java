package SelfStudyTasks;

import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 4, 8, 7, 11, 8, 9, 8, 6, 3};
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < length; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
