package Preparation;

import java.util.Scanner;
//Count digits of given number
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int count = 0;
        while (num!=0){
            num /= 10;
            count++;
        }
        System.out.print("Number of digits : " +count);
    }
}
