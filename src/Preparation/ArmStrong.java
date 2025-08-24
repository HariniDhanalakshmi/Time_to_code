package Preparation;

import java.util.Scanner;

/*
Armstrong number
153 ---> 1*1*1 + 5*5*5 + 3*3*3
1+125+27
153

370 ---> 3*3*3 + 7*7*7 + 0*0*0
27+343+0 = 370
 */
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int temp = num;
        int rem , sum =0;
        while (num>0){
            rem = num%10;
            num = num/10;
            sum = sum+rem*rem*rem;

        }
        if(temp == sum){
            System.out.print(num +"is a Armstrong number");
        }
        else {
            System.out.print(num +"is a Not a Armstrong number");
        }


    }
}
