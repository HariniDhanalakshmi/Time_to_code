package Trypattern;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        /*
        i=1 j=1
        i=2 j=2
        i=3 j=3
        i=4 j=4
        i=5 j=5
         */
        Scanner n = new Scanner(System.in);
        System.out.println("Enter n: ");
        int a = n.nextInt();
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
