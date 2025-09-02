package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Find the longest word in a sentence

ouput
Enter the string: I like apple very much
Longest word: apple

 */
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str += " ";
        String word = "";
        String long_w = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c!= ' '){
                word += c;
            }
            else {
                if(word.length()> long_w.length())
                    long_w = word;
                word = "";
            }

        }
        System.out.print("Longest word: " +long_w);
    }
}
