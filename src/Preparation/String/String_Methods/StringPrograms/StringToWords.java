package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;
/*
Print each word of a sentence in a separate line

output
Enter the string:
How to split sentence into words
How
to
split
sentence
into
words

 */
public class StringToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String w = "";
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                w += ch;
            }
            else {
                System.out.println(w);
                w="";
            }

        }

    }
}
