package Preparation.FactorialSeries;

import java.util.Scanner;

/*

Enter the limits: 1
Enter the x: 2
Sum of series: 5.5114638447971785E-6
 */
public class Fact2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        double sum =0;
        for (int i = 1,a=9,b=1; i <=n ; i++,a+=4,b+=2) {
            int fact =1;
            for (int j = 1; j <= a ; j++) {
                fact = fact * j;
            }
            sum = sum + Math.pow(x,b)/fact;
        }
        System.out.println("Sum of series: "+sum);
    }
}
