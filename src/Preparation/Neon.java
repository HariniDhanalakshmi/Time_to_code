package Preparation;

import java.util.Scanner;

/*
Neon Number

Only neon number is 0,1,9
A number in which the sum of digits of its square = the number.
Example:
9 → 9² = 81 → 8+1 = 9 ✅
1 → 1² = 1 → 1 = 1 ✅
 */
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int sum = 0;
        int sqrt = n * n;
        int temp = sqrt;
        while (temp>0){
            int rem = temp % 10;
            temp /= 10;
            sum += rem;
        }
        if(n == sum){
            System.out.println("Neon Number");
        }else
            System.out.println("Not a neon number");
    }

}

