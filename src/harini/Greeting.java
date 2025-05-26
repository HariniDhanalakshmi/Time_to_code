//Take name as input and print a greeting message for that particular name
package harini;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = input.nextLine();
        System.out.println("Wishing you a very Happiest BirthDay ever " + a + "\uD83E\uDD73");
    }
}
