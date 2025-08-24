package Preparation;

import java.util.Scanner;
//Finding power of 2

public class Findpower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.print("Not a power of 2");
        }else {
            int val =1;
            while (val<n){
                val =val*2;
            }
            if(val == n){
                System.out.print("Yes, Power of 2");
            }
            else
                System.out.print("Not, Not a power of 2");
        }
    }
}
