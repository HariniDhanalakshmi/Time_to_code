package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/* Display each character of a string
Enter string: harini
        h
        a
        r
        i
        n
        i
*/
public class Display_eachchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

    }
}
