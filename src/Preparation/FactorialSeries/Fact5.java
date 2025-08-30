package Preparation.FactorialSeries;

import java.util.Scanner;

/*
output
Enter the limits: 2
Enter x value: 2
Sum of series: 4.0
 */
public class Fact5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 1,a=2; i <=n ; i++,a*=2) {
            int fact = 1;
            for (int j = 1; j <= i + x; j++) {
                fact = fact * j;
            }
            int fact1 = 1;
            for (int j = 1; j <= a; j++) {
                fact1 = fact1 * j;
            }
                sum = sum + (double) fact / fact1;
        }

        System.out.println("Sum of series: "+sum);
    }
}
