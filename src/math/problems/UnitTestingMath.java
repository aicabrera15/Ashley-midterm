package math.problems;
import java.util.Arrays;
import java.util.Scanner;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter first string: ");
        String str1= sc.nextLine();
        System.out.print("Enter second string: ");
        String str2= sc.nextLine();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean Ana = Arrays.equals(charArray1, charArray2);

            if(Ana) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

    }
}
