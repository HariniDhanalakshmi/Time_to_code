package Patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        /*
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         */
        //Upper pattern
        /*
        i= 1 star=1 n=5 sp=8 sp = 2*(n-i)  5-1*2 = 8
        i= 2 star=2 n=5 sp=6
        i= 3 star=3 n=5 sp=4
        i= 4 star=4 n=5 sp=2
        i= 5 star=5 n=5 sp=0
         */
        //Outer loop for rows
        for (int i = 1; i <= n; i++) {
            //print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print space
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }
            //right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern
        /*
        i= 1 star=5 n=5 sp=0 star = n-i+1  5-1+1 = 5
        i= 2 star=4 n=5 sp=2 space = 2*i-2
        i= 3 star=3 n=5 sp=4
        i= 4 star=2 n=5 sp=6
        i= 5 star=1 n=5 sp=8
         */
        //outer loop for rows
        for (int i = 1; i <= n; i++) {
            //print left stars
                for (int j = 1; j <= (n - i) + 1; j++) {
                    System.out.print("*");
                }
                //print spaces
                for (int j = 1; j <= 2*i-2; j++) {
                    System.out.print(" ");
                }
                //print right stars
                for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}