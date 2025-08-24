package Preparation;

import java.util.Scanner;

//Reverse a number or digits
public class Reversedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev *10 + num % 10;
            num /= 10;
        }
        System.out.print("reverse number:" +rev);
    }
}
