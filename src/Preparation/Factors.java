package Preparation;

import java.util.Scanner;

//Factors of a number
public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        if(n>1){
            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    System.out.print(i +" ");
                }
            }
        }
    }
}
