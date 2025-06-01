package Loops;
import java.util.Scanner;
public class Countnums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3428888;
        int count = 0;
        while(n>0) {
            int rem = n % 10;
            if (rem == 8) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

}
