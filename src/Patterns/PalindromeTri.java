package Patterns;

import java.util.Scanner;

public class PalindromeTri {
    public static void main(String[] args) {
        /*
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 0;i <= n;i++) {
            for (int j = 1; j<=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = i;j>=1;j--) {
                System.out.print(j+" ");
            }
            for (int j = 2;j<=i;j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
