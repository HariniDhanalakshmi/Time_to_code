package Patterns;

import java.util.Scanner;

public class Trianglepattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
             *
            ***
           *****
          *******
         *********
         */
        /*
        i = 1 n=5 space = 4 win=1
        i = 2 n=5 space = 3 win=3
        i = 3 n=5 space = 2 win=5
        i = 4 n=5 space = 1 win=7
        i = 5 n=5 space = 0 win=9
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
