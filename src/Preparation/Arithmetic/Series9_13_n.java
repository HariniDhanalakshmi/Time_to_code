package Preparation.Arithmetic;

import java.util.Scanner;

//9+13+17...N
public class Series9_13_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 9; i <=n ; i+=4) {
            sum += i;
            System.out.println(i +" ");
        }
        System.out.println("Sum of series: " +sum);
    }
}
