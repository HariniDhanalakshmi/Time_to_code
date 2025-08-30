package Preparation.FactorialSeries;

import java.util.Scanner;

/*
Enter the limits: 4
Sum of series: 3.0416666666666665
 */

public class Fact6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1,a=2; i <=n ; i++,a++) {
            int fact = 1;
            for (int j = 1; j <= a; j++) {
                fact = fact * j;
            }
            int fact1 = 0;
            for (int j = 1; j <= a; j++) {
                fact1 = fact1 + j;
            }
            sum = sum + (double) fact1 / fact;
        }

        System.out.println("Sum of series: "+sum);
    }
}
