package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Count number of words ending with D

OUTPUT
Enter the string: THIS IS THE RED BAD SAD HAD
No of words ends with D: 4

 */
public class WordsEndD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s+= " ";
        String word = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if(c != ' '){
                word += c;
            }
            else {
                if(word.endsWith("D")){
                    count++;
                }
                word = "";
            }
        }
        System.out.println("No of words ends with D: "+count);
    }
}
