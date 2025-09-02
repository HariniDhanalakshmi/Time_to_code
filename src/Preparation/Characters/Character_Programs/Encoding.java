package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
create a word encoding program which moves each letter by 2.
E.g..A becomes C, B becomes D, Y becomes A and so on.

OUPUT
Enter the string: HARINI
Encoded string: JCTKPK
 */
public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String enc = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if( ch == 'Y' || ch == 'y' || ch == 'Z' || ch == 'z')
                ch -= 26;
            ch += 2;
            enc = enc + ch;
        }
        System.out.print("Encoded string: " +enc);
    }
}
