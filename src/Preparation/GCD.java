package Preparation;

import java.util.Scanner;

//GCD for 2 numbers
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int limit = 0;
        int gcd = 0;
        if(num1<num2)
            limit = num1;
        else
            limit = num2;
        for (int i = 1; i <=limit ; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
