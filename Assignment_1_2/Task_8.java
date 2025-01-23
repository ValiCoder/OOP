//Display the sum of numbers from 1 to 100 inclusive, not divisible by 3. To do this, use a
//while loop.
//        Hint: to move to the next number in a loop, use the continue operator.
//        Requirements:
//        • The program should print to the console the sum of all numbers from 1 to 100 inclusive,
//not divisible by 3.
//        • The program must use a while loop.
//• The program must use the continue statement.

package Assignment_1_2;
public class Task_8 {
    public static void main(String[] args){
        int i = 0;
        int NumbersSum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
            i++;
            continue;
            }
            NumbersSum += i;
            i++;
        }
        System.out.println(NumbersSum+=i);
    }
}
