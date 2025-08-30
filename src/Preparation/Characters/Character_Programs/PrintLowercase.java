package Preparation.Characters.Character_Programs;

import java.util.Scanner;
/*
Print only the lower case
Enter the string: HI how ARe you
h	o	w	e	y	o	u
 */
public class PrintLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch +"\t");
            }
        }
    }
}
