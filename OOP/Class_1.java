package OOP;

public class Class_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        Class_2.reverseArray(array);

        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

