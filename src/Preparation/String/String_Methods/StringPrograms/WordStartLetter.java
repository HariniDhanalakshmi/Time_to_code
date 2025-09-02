package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Print only words starting with R in a sentence
Enter the string:
THIS IS THE RED ROSE
RED
ROSE

 */
public class WordStartLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' ') {
                word += c;
            }
            else {
                if(word.startsWith("R")){
                    System.out.println(word);
                }
                word = "";
            }
        }
    }
}
