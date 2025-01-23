package SelfStudyTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberFactorial {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        long input = Input.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);

        for (long i = 1; i <= input; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.print(factorial);
        Input.close();
    }
}