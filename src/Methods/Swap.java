package Methods;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Scanner inte = new Scanner(System.in);
        int b = inte.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
