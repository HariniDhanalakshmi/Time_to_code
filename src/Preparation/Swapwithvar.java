package Preparation;

import java.util.Scanner;

//Swap two numbers with variable
public class Swapwithvar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: " +a +" " +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " +a +" " +b);
    }
}
