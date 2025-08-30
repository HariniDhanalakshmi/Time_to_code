package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*Print only the upper case letters
Enter the string: jaVA proGRAmming
Uppercase letters: V
Uppercase letters: A
Uppercase letters: G
Uppercase letters: R
Uppercase letters: A
Count of uppercase: 5
 */
public class PrintUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                count++;
                System.out.print("Uppercase letters: "+ch + "\n");
            }
        }
        System.out.print("Count of uppercase: "+count);
    }
}
