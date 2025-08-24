package Preparation;

import java.util.Scanner;

//Finding power of 2 or not Method 1
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        if(n<1){
            System.out.print("No, Not power of 2");
        }else {
            int temp = n;
            while (temp%2 == 0){
                temp = temp/2;
            }
            if(temp == 1)
                System.out.print("Yes, Power of Two");
            else
                System.out.print("No, Not Power of Two");
        }
    }
}
