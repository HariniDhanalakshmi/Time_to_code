package Patterns;

import java.util.Scanner;

public class Mirrorimagetriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        /*
        1 2 3 4 5
         2 3 4 5
          3 4 5
           4 5
            5
           4 5
          3 4 5
         2 3 4 5
        1 2 3 4 5
         */
        //upper triangle
        /*
        i = 1 space = 0 n =5 num =5
        i = 2 space = 1 n =5 num =4
        i = 3 space = 2 n =5 num =4
        i = 4 space = 3 n =5 num =3
        i = 5 space = 4 n =5 num =2
         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        /*Lower triangle
        i = 1 space = 3 n =5 num =4,5   space = n-i-1
        i = 2 space = 2 n =5 num =3,4,5
        i = 3 space = 1 n =5 num =2,3,4,5
        i = 4 space = 0 n =5 num =1,2,3,4,5
         */
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <= n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j <= n ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
