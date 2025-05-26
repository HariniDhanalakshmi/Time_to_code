//Input currency in rupees and output in USD.
package harini;
import java.util.Scanner;
public class rs_to_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the indian rupees: ");
        double rs = input.nextDouble();
        double oneusd = 83.20;
        double usd = rs/oneusd;
        System.out.println("Equivalent amount in usd : " +usd);

    }
}
