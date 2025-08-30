package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
Print all the digits
Enter the string: 2dfgklaf3e32
2
3
3
2
 */
public class Printdigits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                System.out.println(ch);
        }
    }
}
