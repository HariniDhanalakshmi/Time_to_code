package Preparation.Characters.Character_Programs;

import java.util.Scanner;
/*
Count upper case
Enter the limit: hARIni
Count of upper case: 3
 */
public class CountUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                count++;
        }
        System.out.println("Count of upper case: " +count);
    }
}
