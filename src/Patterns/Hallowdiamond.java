package Patterns;

import java.util.Scanner;

public class Hallowdiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = in.nextInt();
        /*
             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *
         */
        /*
        i = 1, spaces = 4, n=5, win = 1 (2*i-1)
        i = 2, spaces = 3, n=5, win = 3
        i = 3, spaces = 2, n=5, win = 5
        i = 4, spaces = 1, n=5, win = 7
        i = 5, spaces = 0, n=5, win = 9
         */
        //Upper pattern
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //printing stars and windows length
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    /* lower pattern
        i = 1, spaces = 1, n=5, win = 7 2*(n-i)-1 == 2*(5-1)-1
        i = 2, spaces = 2, n=5, win = 5 == 2(5-2)-1
        i = 3, spaces = 3, n=5, win = 3  2(5-3)-1
        i = 4, spaces = 4, n=5, win = 1  2(5-4)-1
         */
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //spaces
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            //winlen & spaces
            for (int j = 1; j <=2*(n-i)-1 ; j++) {
                if(j==1 || j==2*(n-i)-1){
                    System.out.print("*");
            }else{
                    System.out.print(" ");
                }
        }
            System.out.println();
    }
    }
}
