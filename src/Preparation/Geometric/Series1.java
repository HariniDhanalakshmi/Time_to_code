package Preparation.Geometric;

import java.util.Scanner;

/*
x/2+x/4+x/8+x/16...N

output
Enter the num: 8
Enter the x value: 2
Sum of series: 1.75
 */
public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        System.out.print("Enter the x value: ");
        int x = sc.nextInt();
        double sum =0;
        for (int i = 2; i <=n ; i*=2) {
            sum += (double) x / i;
        }
        System.out.println("Sum of series: "+sum);
        }
}
