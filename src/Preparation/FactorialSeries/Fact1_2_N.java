package Preparation.FactorialSeries;

import java.util.Scanner;

/*
1!+2!+3!+4!.....N

output
Enter the num: 3
Sum of series: 9

 */
public class Fact1_2_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1,a=1; i <= n ; i++,a++) {
            int fact = 1;
            for (int j = 1; j <= a ; j++) {
                fact = fact * j;
            }
                sum = sum + fact;

        }
        System.out.println("Sum of series: "+sum);
    }
}
