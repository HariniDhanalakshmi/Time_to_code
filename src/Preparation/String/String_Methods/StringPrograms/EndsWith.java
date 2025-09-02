package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Print only the words containing ED in a sentence

OUTPUT
Enter the string:
A RED SEED
RED
SEED

 */
public class EndsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (word.contains("ED")) {
                    System.out.println(word);
                }
                word = "";
            }
        }
    }
}
