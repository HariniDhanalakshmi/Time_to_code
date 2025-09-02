package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;
/*
Delete the word RED in a sentence and print it

OUTPUT
Enter the string: A RED SEED
A SEED
 */
public class Deleteword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        String newWord = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!= ' '){
                word += c;
            }else {
                if(!word.equals("RED")){
                    newWord = newWord + word + " ";
                }
                word = "";
            }
        }
        System.out.print(newWord);
    }
}
