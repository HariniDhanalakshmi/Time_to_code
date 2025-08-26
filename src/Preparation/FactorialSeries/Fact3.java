package Preparation.FactorialSeries;

import java.util.Scanner;

/*
Enter the limit: 3
Enter x value: 2
Sum of series: 2.073611111111111
 */
public class Fact3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 1, a = 2, b=1; i <=n ; i++,a+=2,b+=10) {
            int fact = 1;
            for (int j = 1; j <=a ; j++) {
                fact *= j;
            }
            sum = sum + (double) (b+x)/fact;
        }
        System.out.println("Sum of series: "+sum);
    }
}
