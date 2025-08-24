package Preparation;

import java.util.Scanner;

//To find a number is odd or even
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        if(num%2 == 0) {
            System.out.println(num + "is even number");
        }
        else
            System.out.println(num + "is odd number");
    }
}
