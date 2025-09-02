package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Swap first and last letter of each word of a sentencce

output
Enter the string:
This is the sample sentence
shiT si eht eampls eentencs

 */
public class Swapfirstlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        String ns = "" ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.isEmpty()) {
                    if (word.length() == 1) {
                        ns = ns + word + " ";
                    } else {
                        char f = word.charAt(0);
                        char l = word.charAt(word.length() - 1);
                        String m = word.substring(1, word.length() - 1);
                        ns = ns + l + m + f + " ";
                    }
                    word = "";
                }
            }
        }
                System.out.println(ns.trim());
    }
}
