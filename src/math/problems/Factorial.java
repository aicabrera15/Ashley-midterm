package math.problems;
import java.util.Scanner;

public class Factorial {

    public static int factorialIteration(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static int factorialRecursion(int n) {
        if (n == 0)
            return 1;
        return n * factorialRecursion(n - 1);
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = in.nextInt();
            System.out.println("Factorial of " + n + " using iteration is " + factorialIteration(n));
            System.out.println("Factorial of " + n + " using recursion is " + factorialRecursion(n));
        }


        }

