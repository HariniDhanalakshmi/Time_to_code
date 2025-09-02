package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Special words - starting and ending letter will be same

ouput
Enter the string:
MOM OR DAD
MOM
DAD

 */
public class Specialword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!= ' '){
                word += c;
            }else {
                char f= word.charAt(0);
                char l = word.charAt(word.length()-1);
                if(Character.toUpperCase(f)==Character.toUpperCase(l)){
                    System.out.println(word);
                }
                word= "";
            }

        }
    }
}
