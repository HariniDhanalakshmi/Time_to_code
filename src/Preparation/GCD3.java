package Preparation;

import java.util.Scanner;

//GCD for 3 numbers
public class GCD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int Num1 = sc.nextInt();
        System.out.print("Num2: ");
        int Num2 = sc.nextInt();
        System.out.print("Num3: ");
        int Num3 = sc.nextInt();
        int gcd = 0;
        int res = (Num1 < Num2)? ((Num1<Num3)? Num1 : Num3) : ((Num2<Num3)? Num2 : Num3);
        for (int i = 1; i <= res ; i++) {
            if(Num1 % i == 0 && Num2 %i == 0 && Num3 % i==0){
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
}
