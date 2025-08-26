package Preparation.Geometric;

import java.util.Scanner;

/*
10+30+90+270...N

output
Enter the number: 56
Sum of series: 40
 */
public class Series10_30_90_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 10; i <=n ; i*=3) {
            sum += i;
        }
        System.out.print("Sum of series: " +sum);
    }
}
