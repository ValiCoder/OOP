//In this task, you need to:
//        1. Read 6 strings and fill the strings array with them.
//        2. Remove repeated strings from the strings array, replacing them
//with null (nulls must not be "null" strings).
//Examples.
//1. Array after reading the strings:
//        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//Array after removing repeated strings:
//        {null, null, null, null, "Java", "Tasks", null}
//Requirements:
//        • In the main(String[]) method, read 6 strings from the keyboard and fill the
//strings array with them.
//        • In the main(String[]) method, remove (replace string with null) elements from
//the strings array with identical strings.

package Assignment_2_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = 6;
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = input.next();
        }

        for (int a = 0; a < length; a++) {
            for (int b = a + 1; b < length; b++) {
                if (array[a] != null && array[a].equals(array[b]))
                    array[a] = array[b] = null;
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.print(array[j] + " ");
        }
            input.close();
        }
    }

