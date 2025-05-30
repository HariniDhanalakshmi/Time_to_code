package Loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        //print 0 - 5
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //print event number
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i + " ");
        }
        // print numbers 1 to n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("I will do it!");
        }
        }
}
