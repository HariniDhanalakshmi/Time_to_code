package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Count number of words in a string

output
Enter the string: HAPPY OR SAD
Found
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s+=" ";
        String word = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!= ' '){
                word += c;
            }
            else {
                count++;
                word = "";
            }
        }
        System.out.print("No of words: "+count);
    }
}
