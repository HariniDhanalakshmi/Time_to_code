package Preparation.Characters.Character_Programs;

import java.util.Scanner;
/*
Palindrome string
Enter the string: madam
Palindrome string
 */
public class ChechPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rev = c + rev;
        }
        if(str.equals(rev))
            System.out.print("Palindrome string");
        else
            System.out.print("Not a palindrome string");

    }
}
