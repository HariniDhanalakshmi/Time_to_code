package Preparation;

import java.util.Scanner;

/*
Sunny Number
A number is Sunny if N+1 is a perfect square.
Example:
8 → 8+1 = 9 → perfect square ✅
24 → 24+1 = 25 → perfect square ✅
 */
public class Sunny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n+1;
        int i;
        for (i = 1; i*i <= n; i++) {
            if(i*i == num)
                break;
        }
        if(i*i == num)
            System.out.println("Sunny number");
        else
            System.out.println("Not a sunny number");

    }
}
