package Preparation.Geometric;

import java.util.Scanner;

/*
2+6+18+54....N
Enter the limit: 16
Sum of series: 8
 */

public class Series2_6_18_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <=n ; i*=3) {
            sum += i;
        }
        System.out.print("Sum of series: "+sum);
    }
}
