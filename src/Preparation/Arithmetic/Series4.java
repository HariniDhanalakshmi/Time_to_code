package Preparation.Arithmetic;

import java.util.Scanner;

/*
1^3/x+3^3/x....N

output
Enter limits: 9
Enter x value: 2
Sum of series: 612.5

 */
public class Series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limits: ");
        int n = sc.nextInt();
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        double sum =0.0;
        for (int i = 1; i <=n ; i+=2) {
            sum = (double)(sum + (Math.pow(i,3)/x));
        }
        System.out.print("Sum of series: "+sum);
    }
}
