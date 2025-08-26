package Preparation.FactorialSeries;

import java.util.Scanner;

/*
2!+4!+8!+16!....N

output
Enter the limit: 2
Sum of series: 26
 */
public class Fact248 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int sum =0;
        int n = sc.nextInt();
        for (int i = 1,a=2; i <= n ; i++,a*=2) {
            int fact = 1;
            for (int j = 1; j <=a ; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
        }
        System.out.print("Sum of series: "+sum);
    }
}
