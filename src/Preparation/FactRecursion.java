package Preparation;

import java.util.Scanner;

public class FactRecursion {
        static int fact(int n){
            if (n == 1)

                return 1;

        return n*fact(n-1);
    }

    //other way
    static int factorial(int n){
            if(n==1)
                return 1;
            return n*factorial(n-1);
    }

public static void main(String[] args) {
    System.out.println(fact(8));
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Factorial of "+n+" = "+factorial(n));
}
}