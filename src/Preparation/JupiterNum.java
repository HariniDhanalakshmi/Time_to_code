package Preparation;

import java.util.Scanner;

/*
JUPITER NUMBER   ==>  36,126,86841
number 126
First digit: 1
Last digit: 6
Sum of first and last digits: 1 + 6 = 7
Is 126 divisible by 7? Yes, 126 / 7 = 18 with no remainder.
Therefore, 126 is a Jupiter Number.
 */
public class JupiterNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int num,rev=0,sum=0;
        num = n;
        int ld = n %10;
        while (num>0){
            int d = num%10;
            rev = rev *10+d;
            num = num / 10;
        }
        int fd = rev % 10;
        if(n%(fd+ld)==0)
            System.out.println("It is a Jupiter number");
        else
            System.out.println("It is not a jupiter number");
    }
}
