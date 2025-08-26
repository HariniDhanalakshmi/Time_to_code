package Preparation.Arithmetic;

import java.util.Scanner;

/*
2^x+4^x+6^x+8^x...N

output
Enter limits: 10
Enter power: 2
Sum of series: 220
 */
public class Series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limits: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int x = sc.nextInt();
        int sum =0;
        for (int i = 2; i <=n ; i+=2) {
            sum += Math.pow(i,x);
        }
        System.out.println("Sum of series: "+sum);
    }
}
