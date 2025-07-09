package Patterns;

import java.util.Scanner;

public class Revlefhalf {
    public static void main(String[] args) {
        /*
         *****
          ****
           ***
            **
             *
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            //space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
