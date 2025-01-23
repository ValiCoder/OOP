//Implement the main(String[]) method, which should copy the contents of arrays
//firstArray and secondArray into one array resultArray.
//The firstArray array should be at the beginning of the new resultArray array, and the
//secondArray array should be after it.
//The program must correctly handle arrays of any length.
//        Requirements:
//        • The Solution class must have a public static variable firstArray of type int[],
//initialized with an array of 10 values.
//• The Solution class must have a public static variable secondArray of type int[],
//initialized with an array of 10 values.
//• There must be a public static variable resultArray of type int[] in the Solution
//class.
//        • Implement the main(String[]) method according to the condition.

package Assignment_2_1;

public class Task_4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;
    public static void main(String[] args) {
        resultArray = new int[firstArray.length+ secondArray.length];
        for (int a = 0; a < firstArray.length; a++) {
            resultArray[a] = firstArray[a];
        }
        for (int b = 0; b < secondArray.length; b++) {
            resultArray[firstArray.length+b]=secondArray[b];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
