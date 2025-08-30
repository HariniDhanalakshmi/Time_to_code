package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
Reverse of the string
Enter the string: Java Programming
gnimmargorP avaJ
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
