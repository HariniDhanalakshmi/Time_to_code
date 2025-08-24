package Preparation;

import java.util.Scanner;
/*Sum of factors
6 -> 1,2,3,6 = 12
 */
public class SumofFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int sum_fact=0;
        for (int i = 1; i <=num ; i++) {
            if(num % i == 0){
                sum_fact+=i;
            }
        }
        System.out.print("Sum of factors" +sum_fact);
    }
}
