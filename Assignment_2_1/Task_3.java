//Implement the main(String[]) method, which changes the sign of an array
//element to the opposite sign if the value of that element is even.
//        Requirements:
//        • Implement the main(String[]) method according to the condition.

package Assignment_2_1;

public class Task_3 {
    public static void main(String[] args) {
        int NumberOfElements = 5;
        int[] array = new int[NumberOfElements];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < NumberOfElements; i++) {
            if (array[i]%2 == 0){
                array[i] = array[i]*(-1);
            }
            else continue;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}

