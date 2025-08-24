package Preparation;

import java.util.Scanner;

//LCM of numbers
//a = 5 and b = 7 lcm = 35
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int lcm = a > b ? a : b;
        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }
            System.out.print("LCM of a and b: " +lcm);

    }
}
