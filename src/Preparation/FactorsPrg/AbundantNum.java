package Preparation.FactorsPrg;

import java.util.Scanner;

/*
Abundant number - Sum of factors is greater than the number itself
Eg: 12 - 1,2,3,4,6 = 16 > 12

output
Enter the number: 12
Abundant Number
 */
public class AbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Not a Abundant number");
    }
}
