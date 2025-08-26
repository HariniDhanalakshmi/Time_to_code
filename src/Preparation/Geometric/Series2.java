package Preparation.Geometric;

import java.util.Scanner;

/*
2-6+18-54...N
Enter the limit: 2
Sum of series: -4
 */
public class Series2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i=1,k = 2; i <=n ;i++, k*=3) {
            if(i%2 == 0)
                sum -= k;
            else
                sum += k;
        }
        System.out.print("Sum of series: " +sum);

    }
}
