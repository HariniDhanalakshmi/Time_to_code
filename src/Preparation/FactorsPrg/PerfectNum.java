package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Perfect num : Equal to sum of its divisors or factors except itself
eg : 6 = 1+2+3

output
Enter the number: 6
Perfect number
 */
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0)
                sum = sum + i;
        }
        if(n == sum)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
