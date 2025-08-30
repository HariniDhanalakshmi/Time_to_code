package Preparation.Characters.Character_Programs;
import java.util.Scanner;

/*create new string with digits first and then characters
Enter the string:
vhvD567DHJd
New String: 567vhvDDHJd
*/

public class NewString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String digits = "";
        String letters = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits += ch;   // collect digits first
            } else if (Character.isLetter(ch)) {
                letters += ch;  // then collect letters
            }
        }

        String result = digits + letters;
        System.out.println("New String: " + result);
    }
}
