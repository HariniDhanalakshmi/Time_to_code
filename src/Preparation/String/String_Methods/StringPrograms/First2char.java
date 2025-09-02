package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Print first 2 character of each word

output
Enter the string:
JAVA PROGRAMMING LANGUAGE
JA
PR
LA

 */
public class First2char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s+= " ";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!=' '){
                word += c;
            }
            else {
                System.out.println(word.substring(0,2));
                word = "";
            }

        }
    }
}
