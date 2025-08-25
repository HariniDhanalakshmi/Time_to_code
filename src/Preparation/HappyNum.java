package Preparation;

import java.util.Scanner;

/*
Happy Number
A Happy Number is defined like this:
Start with a number.
Replace the number by the sum of squares of its digits.
Repeat the process until the number becomes 1 (Happy) OR falls into a cycle that never reaches 1 (Unhappy).
✅ Examples: 32,94
19 →
1² + 9² = 1 + 81 = 82
8² + 2² = 64 + 4 = 68
6² + 8² = 36 + 64 = 100
1² + 0² + 0² = 1 → 🎉 Happy Number
 */
public class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        int num,d,sum = 0;
        num = n;
        while (num>9){
            while (num>0){
                d= num %10;
                sum = sum+(d*d);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if(num==1)
            System.out.println("Happy number");
        else
            System.out.println("Not a happy number");

    }
}
