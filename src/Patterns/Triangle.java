package Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /*
             *
            ***
           *****
          *******
         *********
         */
        int n = 5;
        int num=0;

        for (int i = 1; i <= n*2-1; i++) {
            int rowchange=i>n?n*2-i:i;
            for (int j = 1; j <=n-rowchange; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowchange+num; j++){
                System.out.print("*");
            }
            num++;
            System.out.println();
        }
    }
}

