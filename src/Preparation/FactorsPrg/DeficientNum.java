package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Deficient number: Sum of factors is less than number itself
eg: 21 - 1,3,7 = 11<21

output
Enter the number: 21
Deficient Number
 */
public class DeficientNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0)
                sum += i;
        }
        if(sum < n)
            System.out.println("Deficient Number");
        else
            System.out.println("Not a deficient number");
    }
}
