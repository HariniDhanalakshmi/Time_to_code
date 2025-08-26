package Preparation.FactorialSeries;

import java.util.Scanner;

/*
10!+9!+8!+....1!

Enter the limits(1 to 10): 3
Sum of series: 4032000
 */
public class Fact1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limits(1 to 10): ");
        int sum =0;
        int n = sc.nextInt();
        for (int i = 1,a=10; i <=n ; i++,a--) {
            int fact = 1;
            for (int j = 1; j <=a ; j++) {
                fact = fact * j;
            }
            sum = sum +fact;
        }
        System.out.println("Sum of series: "+sum);
    }
}
