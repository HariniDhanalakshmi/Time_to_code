package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
Lowercase count
Enter the string: HaRIni
Lowercase count: 3
 */
public class CountLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
                count++;
         }
        System.out.println("Lowercase count: " +count);
    }
}
