package Preparation;

import java.util.Scanner;
//Finding power of 3
public class PowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.print("Not a power of 3");
        }else {
            int val =1;
            while (val<n){
                val = val*3;
            }
            if(val == n){
                System.out.print("Yes, Power of 3");
            }
            else {
                System.out.print("No, Not power of 3");
            }
        }

    }
}
