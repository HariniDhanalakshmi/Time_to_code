package Preparation.Arithmetic;

import java.util.Scanner;

/*
2/10+4/9+6/8+8/7
Enter the limits: 10
Sum of series: 4.203968253968254
 */
public class Series5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        double sum =0.0;
        for (int a = 2,b=10; a <= n ; a+=2,b--) {
            sum = sum+((double) a/b);
        }
        System.out.print("Sum of series: "+sum);
    }
}
