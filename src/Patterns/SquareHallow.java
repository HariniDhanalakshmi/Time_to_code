package Patterns;

import java.util.Scanner;

public class SquareHallow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
        * * * * * *
        *         *
        *         *
        *         *
        *         *
        * * * * * *
         */
        /*
        i = 1 n=6 win=6
        i = 2 n=6 win=6
        i = 3 n=6 win=6
        i = 4 n=6 win=6
        i = 5 n=6 win=6
        i = 6 n=6 win=6
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1||i==n||j==n||j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
