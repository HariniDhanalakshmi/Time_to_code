package Preparation.Arithmetic;

import java.util.Scanner;

/*
9^2+13^2+17^2....N

output
Enter limit: 17
Sum of series: 539
 */

public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 9; i <=n ; i+=4) {
            sum += Math.pow(i,2);
        }
        System.out.println("Sum of series: "+sum);

    }
}
