//In the Solution class, initialize the array field with the value of a two-dimensional array of integers
//of size 2x3.
//In the main method, fill this array with integers (except 0) and display it on the screen.
//Requirements:
//        • The array field of the Solution class must be initialized with the value of a twodimensional array of integers of size 2x3.
//• This array must be filled with any integers other than 0.
//        • The program needs to output the elements of an array, each element on a new
//line.

package Assignment_2_1;

public class Task_12 {
    public static int[][] array = {{1, 3, 5}, {2, 4, 6}};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

