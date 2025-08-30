package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
ASCII Values of each character
Enter the string: HARINI
H 72
A 65
R 82
I 73
N 78
I 73
 */
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int c = (int)ch;
            System.out.println(ch +" " +c);
        }
    }
}
