package Patterns;

import java.util.Scanner;

public class NumInc {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
