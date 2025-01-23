//Output a rectangle, its perimeter and area



package SelfStudyTasks;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int height = Input.nextInt();
        int width = Input.nextInt();
        int perimeter = 2 * (height + width);
        int area = height * width;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("The area of a " +height+ " by " +width+ " rectangle is " +area+ " and the perimeter is " +perimeter);
    Input.close();
    }
}
