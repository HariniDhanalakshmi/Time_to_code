package Preparation;

import java.util.Scanner;

/*
Harshad / Niven Number
A number that is divisible by the sum of its digits.
Example:
18 → sum of digits = 1+8 = 9 → 18 ÷ 9 = 2 ✅
21 → sum of digits = 2+1 = 3 → 21 ÷ 3 = 7 ✅
 */
public class Harshad_or_Niven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp>0){
            int rem = temp % 10;
            sum = sum + rem;
            temp =temp/10;
        }
        if(num%sum == 0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");
    }
}
