package Preparation.Arithmetic;

import java.util.Scanner;

/*
x1+x2+x3+x4+x5+x6....N

output
Enter base: 3
Enter power: 5
Sum of series: 363
 */

public class Series1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            sum += (int)Math.pow(x,i);

        }
        System.out.println("Sum of series: "+sum);
    }
}
