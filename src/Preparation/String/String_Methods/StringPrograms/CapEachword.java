package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Program to capitalize each word of a sentence

output
Enter the string:
the sample is good
The Sample Is Good

 */
public class CapEachword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                char f = word.charAt(0);
                f = Character.toUpperCase(f);
                ns = ns + f + word.substring(1) + " ";
                word = "";
            }
        }

        System.out.println(ns);
    }
}
