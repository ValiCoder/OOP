//A two-dimensional array of chars is given. You need to replace all internal elements with hyphen
//        (minus) in the main method.
//To print the contents of the array to the screen, use the private printArray() method.
//Example of an array:
//a b c d e f
//g h i j k l
//m n o p q r
//s t u v w x
//After running the program, the array should contain:
//a b c d d e f f
//g - - - - - - l
//m - - - - - - - - r
//s t u v w x
//Requirements:
//        • In the main method, you must replace all internal elements of the chars array
//with hyphens (see the example in the condition).

package Assignment_2_1;

public class Task_17 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};


    public static void main(String[] args) {
        printArray();
        for (int i = 1; i < chars.length -1; i++) {
            for (int j = 1; j <chars[i].length -1; j++) {
                    chars[i][j] = '-';
            }
        }
        printArray();
    }
    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}