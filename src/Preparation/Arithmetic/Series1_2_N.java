package Preparation.Arithmetic;

import java.util.Scanner;
//1+2+3+4.....N
public class Series1_2_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum =0;
        int res = 0;
        for (int i = 1; i <=n ; i++) {
            sum +=i;
            System.out.println(i +" ");
        }
        System.out.println();
        System.out.println("Sum of series: " +sum);



        //Other way for using for loop
        for (int i = 1,k=1; i <=n ; i++,k++) {
            res = res + k;
            System.out.println(k + " ");
        }
        System.out.println("K sum of series: " +res);
    }
}
