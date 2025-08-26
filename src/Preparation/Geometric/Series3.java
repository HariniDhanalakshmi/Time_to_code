package Preparation.Geometric;

import java.util.Scanner;

/*
x+2/10+x+4/30+x+6/90+....N
Enter the num: 2
Enter the value of x: 5
Sum of series: 1.0
 */
public class Series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        double sum = 0;
        System.out.print("Enter the value of x: ");
        double x = sc.nextInt();
        for (int i = 1,a=2,b=10; i <=n ; i++,a*=2,b*=3) {
            sum = (double) sum + (x+a)/b;
        }
        System.out.print("Sum of series: "+sum);
    }
}
