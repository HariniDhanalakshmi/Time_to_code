package Preparation;

import java.util.Scanner;

public class Palindrometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while (temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
