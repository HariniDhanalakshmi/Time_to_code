package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Print only words having 3 characters in a sentence

Output
Enter the string:
there Are the pretty flowers
Are
the

 */
public class Threechar {
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
            }else{
                if(word.length()==3){
                    System.out.println(word);
                }
                word = "";
            }
        }
    }
}
