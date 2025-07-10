package Patterns;

import java.util.Scanner;

public class Zeroone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        /*
        1               11
        0 1             21 22
        1 0 1           31 32 33
        0 1 0 1         41 42 43 44
        1 0 1 0 1       51 52 53 54 55
         */
        /*
        i=1 n=5 no=1
        i=2 n=5 no=2
        i=3 n=5 no=3
        i=4 n=5 no=4
        i=5 n=5 no=5


         */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i  ; j++) {
               if((i+j)%2==0){
                   System.out.print("1 ");
               }else {
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }
    }
}
