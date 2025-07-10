package Patterns;

import java.util.Scanner;

public class Hhourglass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = in.nextInt();
        /*
         * * * * *
          *     *
           *   *
            * *
             *
            * *
           *   *
          *     *
         * * * * *
         */
        /*upper pattern
        i = 1, spaces = 0, n=5, win = 5 space= n-1
        i = 2, spaces = 1, n=5, win = 4 2*(n-i)+1  >>2(4)+1
        i = 3, spaces = 2, n=5, win = 3
        i = 4, spaces = 3, n=5, win = 2
        i = 5, spaces = 4, n=5, win = 1
         */
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            //space
            for (int j = 1; j <= n-i+1; j++) {
                if (i == 1 || j == 1 || j == n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /*Downwards pattern
        i = 1, spaces = 3, n=5, win = 2 space= n-i-1 >>5-4-1
        i = 2, spaces = 2  n=5, win = 3 i+1  >>4+1
        i = 3, spaces = 1, n=5, win = 4
        i = 4, spaces = 0, n=5, win = 5
         */
        for (int i = 1; i<n ; i++) {
            for (int j = 1; j <= n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1 ; j++) {
                if( i==n-1 || j==1 || j== i+1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
