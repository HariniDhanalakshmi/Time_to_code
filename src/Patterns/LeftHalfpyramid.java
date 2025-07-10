package Patterns;

import java.util.Scanner;

public class LeftHalfpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
             *
            **
           ***
          ****
         *****
         */
        /*
        i = 1 n=5 space = 4 star=1 space = n-1
        i = 2 n=5 space = 3 star=2 star = i
        i = 3 n=5 space = 2 star=3
        i = 4 n=5 space = 1 star=4
        i = 5 n=5 space = 0 star=5
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
