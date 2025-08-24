package Preparation;

import java.util.Scanner;

/*Perfect numbers   6,28,496,8128
sum of factors of a given number = given number
given num = 6
factors of 6 = 1 2 3  == 6
given num= factors
therefore it is perfect number
*/

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        if(n>1){
            for (int i = 1; i < n ; i++) {
                if(n%i == 0){
                    sum+=i;
                }
            }
            System.out.println("Sum of factors: " +sum);
        }
        if(n==sum){
            System.out.println("Perfect number");
        }else
            System.out.println("Not a Perfect number");
    }
}
