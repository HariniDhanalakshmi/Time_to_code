package Preparation.Geometric;

import java.util.Scanner;

/*
5+25+125+....N
Output
Enter the limit: 30
Sum of series: 30
 */
public class Series5_25_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 5; i <=n ; i*=5) {
          sum += i;
        }
        System.out.print("Sum of series: "+sum);
    }
}
