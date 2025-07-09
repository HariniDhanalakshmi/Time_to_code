package Patterns;

import java.util.Scanner;

public class NumTri {
    public static void main(String[] args) {
        /*
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
