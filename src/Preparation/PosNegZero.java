package Preparation;

import java.util.Scanner;
//to find given number is positive negative or zero
public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num ");
        int num = sc.nextInt();
        if(num>0)
            System.out.println("Postive number");
        else if(num<0)
            System.out.println("Negative number");
        else
            System.out.println("Value of number is Zero");
        String value = (num>0)?"Positive":"negative";
        System.out.println("value is " +value);
    }
}
