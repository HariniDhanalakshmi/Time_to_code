package Preparation;

import java.util.Scanner;

//To check given number is prime or not
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        if(n>1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print("Prime number");
            } else {
                System.out.print("Not prime number");
            }
        }
        else
            System.out.println("Not a prime");
    }
}
