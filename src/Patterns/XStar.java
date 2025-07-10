package Patterns;

import java.util.Scanner;

public class XStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = in.nextInt();
        /*
         *       *
          *     *
           *   *
            * *
             *
            * *
           *   *
          *     *
         *       *
         */
        /*Upper part
        i=1 space= 0 n = 5 win = 5 space=i-1
        i=2 space= 1 n = 5 win = 4 2*(n-i)+1
        i=3 space= 2 n = 5 win = 3
        i=4 space= 3 n = 5 win = 2
        i=5 space= 4 n = 5 win = 1
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1 ; j++) {
                if (j == 1 || j == 2 * (n - i) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*Lower part
        i=1 space= 3 n = 5 win = 2 space= n-i-1
        i=2 space= 2 n = 5 win = 3 2*(n-i)+1
        i=3 space= 1 n = 5 win = 4
        i=4 space= 0 n = 5 win = 5
         */
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <= n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1 ; j++) {
                if(j==1 || j==i+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
