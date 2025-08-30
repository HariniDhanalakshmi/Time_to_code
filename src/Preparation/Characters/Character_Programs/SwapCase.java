package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
Enter the string: This is JaVA ProGRamming
New String= tHIS IS jAva pROgrAMMING
 */
public class SwapCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String str = " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
                str+=Character.toUpperCase(c);
            else if (Character.isUpperCase(c)) {
                str+=Character.toLowerCase(c);
            }
            else
                str+= c;
        }
        System.out.println("New String="+str);
    }
}
