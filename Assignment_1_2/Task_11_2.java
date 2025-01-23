//Let's use a for loop to display a right triangle of eights with sides 10 and 10.
//        That is, the first line should have one 8, starting from the left, the second line should have
//two, etc.
//Example of screen output:
//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888
//Requirements:
//        • The program should display numbers on the screen.
//        • The program should produce a right-angled triangle of eights with sides 10 and 10.
//        • The program must use a for loop.


package Assignment_1_2;

public class Task_11_2 {
    public static void main(String[] args){
        int Height = 25
                ;
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i * 2 - 2); j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
