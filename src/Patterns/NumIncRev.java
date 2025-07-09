package Patterns;

import java.util.Scanner;

public class NumIncRev {
    public static void main(String[] args) {
        /*
        12345
        1234
        123
        12
        1
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
