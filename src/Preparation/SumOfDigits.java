package Preparation;

import java.util.Scanner;

//Sum of digits
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int rem = 0;
        while (num != 0){
            rem += num % 10;
            num /= 10;
        }
        System.out.print("Sum of digits " +rem);
    }
}
