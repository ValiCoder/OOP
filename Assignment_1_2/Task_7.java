//Using nested while loops (a loop within a loop), display a 5 (height) by 10 (width) rectangle
//filled with the letter 'Q'.
//Example output:
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//Requirements:
//        • The program must display text on the screen.
//        • The program should output a rectangle of height 5 and width 10 filled with the letters 'Q'.
//        • The program must use nested while loops (loop within a loop).
//        • Printing to the screen should occur in a while loop.

package Assignment_1_2;

public class Task_7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        int i = 0, j = 0;

        while (i < n){
            j = 0;
            while (j < m) {
                System.out.print("Q");
            j++;
            }
            System.out.println();
            i++;
        }
    }
}
