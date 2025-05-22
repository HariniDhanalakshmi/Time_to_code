package harini;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine()); //prints the complete line
        System.out.println(input.nextInt()); //prints number
        System.out.println(input.next()); //prints the first word in line
    }
}