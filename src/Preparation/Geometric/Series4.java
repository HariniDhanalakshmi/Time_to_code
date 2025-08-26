package Preparation.Geometric;

import java.util.Scanner;

/*
(x+5^2)/(1+2) + (x+25^2)/(2+3) +....N

output
Enter the limit: 3
Enter the value of x: 1
Sum of series: 2366.152380952381
 */

public class Series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        double sum =0;
        for (int i = 1,a=5,b=1,c=2; i <=n ; i++,a*=5,b++,c++){
            sum = (double) (sum) + (x+Math.pow(a,2))/(b+c);
        }
        System.out.print("Sum of series: "+sum);
    }
}
