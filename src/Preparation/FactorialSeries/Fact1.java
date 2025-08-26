package Preparation.FactorialSeries;

import java.util.Scanner;

/*
x1/1!+x2/2!+x3/3!+...+xn/n!
Enter the limits: 5
Enter the x: 2
Sum of series: 6.266666666666667
 */
public class Fact1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        double sum =0;
        for (int i = 1,a=1; i <=n ; i++,a++) {
            double fact = 1;
            for (int j = 1; j <=a ; j++) {
                fact *= j;
            }
            sum = sum + Math.pow(x,a)/fact;
        }
        System.out.println("Sum of series: "+sum);
    }

}
