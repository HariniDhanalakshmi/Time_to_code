package Patterns;

import java.util.Scanner;

public class RightPascal {
    public static void main(String[] args) {
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i  ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
