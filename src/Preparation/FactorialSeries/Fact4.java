package Preparation.FactorialSeries;

import java.util.Scanner;

/*
Enter the limit: 3
Sum of series: 2.3333333333333335
 */
public class Fact4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i=1,a=2; a <=n ; i++,a++) {
            int fact = 1;
            for (int j = 1; j <=a ; j++) {
                fact *= j;
            }
            sum = sum + (double)(i+a)/fact;
        }
        System.out.println("Sum of series: "+sum);
    }
}
