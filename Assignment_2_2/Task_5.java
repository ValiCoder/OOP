//Let's write a utility for working with arrays. The main part of the functionality is ready: the
//printArray() method prints all array elements in the console.
//You just need to implement the reverseArray() method. It should reverse
//the order of array elements.
//The method should work only with arrays of integer values (int[]).
//Example:
//If the array contained elements:
//        1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 0
//then after calling the reverseArray() method it should contain:
//        0, 9, 8, 7, 6, 5, 4, 3, 2, 1
//Requirements:
//        • The reverseArray() method should reverse the order of the array elements.

package Assignment_2_2;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

