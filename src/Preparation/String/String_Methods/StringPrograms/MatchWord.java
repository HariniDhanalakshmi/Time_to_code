package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Find if the word exist or not in a
Enter the string: I am very Happy
True

 */
public class MatchWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        String new_word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.contains("Happy")){
                 System.out.println("True");
                 break;
            }else {
                System.out.println("Not found");
            }

        }
    }
}
