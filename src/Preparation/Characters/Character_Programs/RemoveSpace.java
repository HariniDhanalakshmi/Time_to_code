package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
Remove all spaces between string
Enter the string: Space between string
Spacebetweenstring
 */

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String remove = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch))
                remove += ch;
        }
        System.out.print(remove);
    }
}
