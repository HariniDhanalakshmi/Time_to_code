package Preparation;

import java.util.Scanner;
//Greatest of two numbers
public class Largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        if(a>b)
            System.out.println("A is Largest");
        else
            System.out.println("B is Largest");

        //Conditional operator
        int res = (a>b)?a:b;
        System.out.println("Largest num is: "+res);
    }
}
