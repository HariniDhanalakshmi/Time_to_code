package Preparation;


import java.util.Scanner;

/*
Automorphic Number
A number whose square ends with the same number.
Example:
25² = 625 → ends with 25 ✅
76² = 5776 → ends with 76 ✅
 */
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqt = num *num;
        int temp = num;
        int digits = 0;
        while (temp>0){
            digits++;
            temp/=10;
        }
        int div = 1;
        for (int i = 1; i <= digits ; i++) {
            div = div *10;

        }
        if(sqt % div == num)
            System.out.println("Automorphic number");
        else
            System.out.println("Not Automorphic number");
    }
}
