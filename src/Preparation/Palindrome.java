package Preparation;

import java.util.Scanner;

/*given number 121
reversed numebr 121
if both same then it is palindrome number
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        /*int num = sc.nextInt();
        int rev = 0;
        int temp=num;
        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
            System.out.print(rem+ " ");
          */

        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while (temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;

        }
        if(num == rev){
            System.out.print("Is a Palindrome number");
        }else
            System.out.print("Is Not a palindrome number");
    }
}
