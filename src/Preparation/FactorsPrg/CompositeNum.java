package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Composite number - which has more than 3 factors

output
Enter the number: 8
Composite number

 */

public class CompositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i==0)
                count++;
        }
        if(count >= 3)
            System.out.println("Composite number");
        else
            System.out.println("Not a composite number");
    }
}
