package Patterns;

import java.util.Scanner;

public class RevnumTri {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
         2 3 4 5
          3 4 5
           4 5
            5
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
