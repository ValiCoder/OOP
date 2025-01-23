package SelfStudyTasks;

import java.util.Scanner;

public class Join2Lists {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int length = Input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i <length ; i++) {
            array[i] = Input.nextInt();
        }
        for (int j = 0; j <length; j++) {
        System.out.print(array[j]+" ");
        }
   Input.close();
    }
}


//public class Task_4 {
//    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//    public static int[] resultArray;
//    public static void main(String[] args) {
//        resultArray = new int[firstArray.length+ secondArray.length];
//        for (int a = 0; a < firstArray.length; a++) {
//            resultArray[a] = firstArray[a];
//        }
//        for (int b = 0; b < secondArray.length; b++) {
//            resultArray[firstArray.length+b]=secondArray[b];
//        }
//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + ", ");
//        }
//    }
//}