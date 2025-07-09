package Training4;
import java.util.Scanner;
public class Neww {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String a = input.nextLine();
        String original = a.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println("\"" + a + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + a + "\" is NOT a Palindrome.");
        }
    }
}
