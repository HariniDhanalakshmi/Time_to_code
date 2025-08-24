package Preparation;

import java.util.Scanner;

//Sum of natural numbers
public class SumofNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //By using formula
        int sum = (n*(n+1)/2);
        System.out.println("Sum of n natural numbers: "+sum);

        //By using for loop
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        System.out.print("Result : " +res);
    }
}
