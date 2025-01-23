//Enter your name and age using the keyboard. If the age is between 18-28 (inclusive), then
//display the message “Name, come to the military registration and enlistment office”, where
//Name is the name entered earlier from the keyboard.
//Example input:
//Alex
//18
//Example output:
//Alex, come to the military registration and enlistment office

package Assignment_1_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner NamePerson = new Scanner(System.in);
        String Name = NamePerson.nextLine();
        System.out.println("Please enter your age");
        Scanner myObj = new Scanner(System.in);
        int Age = myObj.nextInt();

        if (Age < 18 || Age > 28) {
            System.out.println("You are free of military service");
        }
        else {
            System.out.println(Name + ", please come to the military enlistment office");
        }
        NamePerson.close();
        myObj.close();
    }

}
