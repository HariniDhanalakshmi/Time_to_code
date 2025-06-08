package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Fibonacci Series In Java Programs
        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for(int i =1; i<=n; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

