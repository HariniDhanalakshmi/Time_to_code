package Preparation.FactorialSeries;

import java.util.Scanner;

/*
1*2+1*2*3+.....N

output
Enter the limits: 3
Sum of series: 32

 */
public class Fact123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter the limits: ");
        int n = sc.nextInt();
        for (int i = 1,a=2; i <=n ; i++,a++) {
            int fact = 1;
            for (int j = 1; j <= a ; j++) {
                fact *= j;
            }
            sum += fact;
        }
        System.out.println("Sum of series: "+sum);
    }
}
