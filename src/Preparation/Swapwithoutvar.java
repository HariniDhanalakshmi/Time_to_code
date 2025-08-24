package Preparation;

import java.util.Scanner;

//Swap two numbers without variable
public class Swapwithoutvar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Before swap: " +a +" " +b);  //a = 3 b =4
        a = a + b; //  a = 3 b= 4     a = 3+4   =>7
        b = a - b; // b = 7-4    b = 3
        a = a - b; // a = 7-3    a = 4
        System.out.println("After swap: " +a +" " +b); // a =4 b =3
    }
}
