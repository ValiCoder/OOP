package Assignment_1_1;//It is now 3126. My friend was born 8 years ago.
//Write a program that displays the year of birth of my friend.
//Requirements:
//        • The program must use screen output.
//        • The year displayed must be 4 digits long.
//        • The year displayed must begin with "31".
//        • The year derived must match the assignment.


public class Task_3 {
    public static void main(String[] args) {
        int NowYear = 3126;
        int AgeOfFriend = 8;
        int YearBorn = (NowYear - AgeOfFriend);
        System.out.println(YearBorn);
    }
}
