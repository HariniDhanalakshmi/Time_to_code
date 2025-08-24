package Preparation;

import java.util.Scanner;

/*
Spy Number
A number where sum of digits = product of digits.
Example:
123 → sum = 1+2+3 = 6, product = 1×2×3 = 6 ✅
1124 → sum = 8, product = 8 ✅
 */
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int prod = 1;
        int rem;
        while (temp>0){
            rem = temp % 10;
            sum +=  rem;
            prod *=  rem;
            temp /= 10;
        }
        if(sum == prod)
            System.out.println(n +" is a Spy Number");
        else
            System.out.println(n +" is Not a Spy Number");
    }
}
