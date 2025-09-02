package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Find first character of each word

output
Enter the string:
Fist char at each word
F
c
a
e
w

 */
public class FirstOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }
            else {
                System.out.println(word.charAt(0));
                word = "";
            }
        }
    }
}
