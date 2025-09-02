package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Pronic number : Product of two consecutive integers, n(n+1)
eg: 56 = 7*8

output
Enter the number: 56
Pronic Number

 */
public class PronicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 0;
        for (int i = 0; i <= n ; i++) {
                if(i*(i+1) == n){
                    fact = i;
                break;
                }
        }
        if(fact != 0 || n ==0)
            System.out.println("Pronic Number");
        else
            System.out.println("Not a pronic number");
    }
}
