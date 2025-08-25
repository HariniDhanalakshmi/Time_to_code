package Preparation;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n,p=0,d=10;
        n = sc.nextInt();
        int k = n*n;
        while (p<n){
            p = k%d;
            d=d*10;
        }
        if(p==n)
            System.out.println("Automorphic number");
        else
            System.out.println("Not automorphic");
    }
}
