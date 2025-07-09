package Patterns;

import java.util.Scanner;

public class Hallowtriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        /*
             *
            * *
           *   *
          *     *
         *********
         */
        /*
        i = 1 spaces = 4 n=5 winlen= 1 space = 2*i-1
        i = 2 spaces = 3 n=5 winlen= 3
        i = 3 spaces = 2 n=5 winlen= 5
        i = 4 spaces = 1 n=5 winlen= 7
        i = 5 spaces = 0 n=5 winlen= 9
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(i==n || j==1 || j==2*i-1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
