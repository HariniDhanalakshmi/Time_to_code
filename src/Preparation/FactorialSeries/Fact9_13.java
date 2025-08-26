package Preparation.FactorialSeries;

import java.util.Scanner;

/*
9!+13!+17!+…..N

output
Enter the num: 1
Sum of series: 362880
 */
public class Fact9_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1,a=9; i <= n ; i++,a+=4) {
            int fact =1;
            for (int j = 1; j <=a ; j++) {
                fact = fact * j;
            }
                sum = sum + fact;
            }
        System.out.println("Sum of series: " +sum);
    }
}
