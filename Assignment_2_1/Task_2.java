//In the main(String[]) method you need to fill the strings array with values. If the
//array index is even - assign the value "Even" (zero is an even number), otherwise
//assign "Odd".
//Text output to the console is not involved in the testing.
//        Requirements:
//        • The Solution class must have a public static variable strings of type String[],
//initialized with an array of size 5 elements.
//• The main(String[]) method should fill the array according to the condition.

package Assignment_2_1;

public class Task_2 {
        public static final String ODD = "Odd";
        public static final String EVEN = "Even";
        public static String[] strings = new String[5];
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                if (i%2 == 0){
                    strings[i] = "Even";
                }
                else {
                    strings[i] = "Odd";
                }
            }
            System.out.print("index = 0");
            System.out.println(" value = " + strings[0]);
            System.out.print("index = 1");
            System.out.println(" value = " + strings[1]);
            System.out.print("index = 2");
            System.out.println(" value = " + strings[2]);
            System.out.print("index = 3");
            System.out.println(" value = " + strings[3]);
            System.out.print("index = 4");
            System.out.println(" value = " + strings[4]);
        }
    }
