package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Prime number -  a number divisible by 1 and itself only

output
Enter the number: 17
Prime number
 */
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count  = 0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)
                count++;
        }
        if(count == 2)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
