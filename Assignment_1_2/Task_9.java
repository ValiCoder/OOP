//Write a program in which, using a for loop, even numbers from 1 to 15 will be displayed on
//the screen.
//Each value must be printed on a new line.
//        Requirements:
//        • The program must display text on the screen.
//        • The program should print even numbers from 1 to 15. Print each value on a new line.
//• The program must use a for loop.


package Assignment_1_2;

public class Task_9 {
    public static void main(String[] args){
        int Number = 15;
        int i = 0;
        for (int j = 0; j < Number; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
