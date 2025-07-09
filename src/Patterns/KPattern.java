package Patterns;

import java.util.Scanner;

public class KPattern {
    public static void main(String[] args) {
        /*
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i+1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
