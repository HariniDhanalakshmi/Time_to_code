package Preparation.Arithmetic;

import java.util.Scanner;

//2+4+6+8...N
public class Series2_4_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 2; i <=n ; i+=2) {
            sum += i;
            System.out.println(i +" ");
        }
        System.out.println("Sum of series: " +sum);
    }
}
