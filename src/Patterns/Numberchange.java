package Patterns;

import java.util.Scanner;

public class Numberchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */
        /*
        i=1 n=5 no=1
        i=2 n=5 no=2
        i=3 n=5 no=3
        i=4 n=5 no=4
        i=5 n=5 no=5
         */
        int num=1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
