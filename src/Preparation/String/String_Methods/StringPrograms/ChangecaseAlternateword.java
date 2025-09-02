package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Take a sentencse and change case of each alternate word.

output
Enter the string:
This is the sample sentence
THIS is THE sample SENTENCE
 */
public class ChangecaseAlternateword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        String ns = "";
        int count  = 0;
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(count++ % 2 == 0) {
                    ns = ns + word.toUpperCase() + " ";
                }else {
                    ns = ns + word.toLowerCase() + " ";
                }
                word = "";
            }
        }
        System.out.println(ns);
    }
}
