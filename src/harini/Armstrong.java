package harini;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int low = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int high = scanner.nextInt();
        System.out.println("Armstrong numbers between " + low + " and " + high + " are:");
        for (int num = low; num <= high; num++) {
            int temp = num;
            int digits = 0;
            while (temp != 0) {
                temp /= 10;
                digits++;
            }
            temp = num;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}
