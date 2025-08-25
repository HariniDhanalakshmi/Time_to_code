package Preparation;

import java.util.Scanner;
/*
Duck Number
A number that contains zero(s), but not at the beginning.
Example:
3210 → contains 0 → Duck ✅
705 → contains 0 → Duck ✅
0123 → invalid (leading zero) ❌
 */
public class Duck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        if (num % 100 == num) {
            System.out.println(num + "Leading zero is NOT Duck Number");
            return;
        }
        while (temp > 0) {
            if (temp % 10 == 0) {
                System.out.println(num + " is Duck Number");
                return;   // exit as soon as zero is found
            }
            temp /= 10;
        }
        System.out.println(num + " No zero is NOT Duck Number");

    }

}
