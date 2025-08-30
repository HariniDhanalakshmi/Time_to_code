package Preparation.Characters.Character_Programs;

import java.util.Scanner;

public class LetterOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                System.out.print(ch);
            }

        }
    }
}
