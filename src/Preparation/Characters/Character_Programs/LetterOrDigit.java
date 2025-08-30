package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*Print number is letter or digit
Enter the string: Test@13
Letter: T
Letter: e
Letter: s
Letter: t
Special character: @
Digit: 1
Digit: 3
 */
public class LetterOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                System.out.println("Letter: " +ch);
            }
            else if(Character.isDigit(ch)){
                System.out.println("Digit: " +ch);
            }
            else
                System.out.println("Special character: " +ch);

        }
    }
}
