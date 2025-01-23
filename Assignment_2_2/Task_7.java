//In front of you is the signIn() method, which welcomes users to the site. Right now it
//greets all users, but it should only greet registered users. The names of all unregistered
//users are "user".
//Add a user name check at the beginning of the signIn() method.
//If the name is "user", abort the method using the return keyword.
//        Requirements:
//        • If the username is "user", the signIn() method should terminate without outputting
//anything to the console.
//        • If the username is not "user", the signIn() method should continue to run and print
//the greeting lines in the console.
//        • The return keyword must be used to abort the signIn() method.

package Assignment_2_2;

import java.util.Locale;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username = "user";

        System.out.print("Hello! Would you like to sign in? (Yes/No) ");
        String answer = input.next();

        if (answer.toUpperCase(Locale.ROOT).equals("YES")) {
            System.out.print("Please input your name: ");
            input.nextLine();  // Consume the newline left by next()
            username = input.nextLine();
        }

        signIn(username);
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}

