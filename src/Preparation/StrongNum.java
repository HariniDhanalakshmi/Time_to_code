package Preparation;
import java.util.Scanner;
/*
Strong Number
A number in which the sum of factorial of digits = the number.
Example:
145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 ✅
*/
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
            if(sum == num)
                System.out.print(num +" is Strong Number");
            else
                System.out.print(num +" is Not Strong Number");
    }
}
