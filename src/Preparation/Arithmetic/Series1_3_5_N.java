package Preparation.Arithmetic;

import java.util.Scanner;

//1+3+5+7...N
public class Series1_3_5_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i+=2) {
            sum +=i;
            System.out.println(i +" ");
        }
        System.out.println("Sum of series: "+sum);
    }
}
