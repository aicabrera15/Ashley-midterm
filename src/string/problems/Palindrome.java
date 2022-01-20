package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String str1, str2="";       //initialize strings
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a word to see if is palindrome or not palindrome: ");
        str1= sc.nextLine();
        int i, n= str1.length();
        for(i=n-1; i>=0; i--)
        {
            str2= str2+ str1.charAt(i);      //reversing the string
        }
        if(str1.equalsIgnoreCase(str2))      //checking the strings
        {
            System.out.println("The String is palindrome");
        }
        else
        {
            System.out.println("The String is not palindrome");
        }
    }
}
