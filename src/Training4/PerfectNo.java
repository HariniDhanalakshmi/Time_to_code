package Training4;

import java.util.Scanner;

public class PerfectNo {
    //factors of given number
    public static void main(String[] args) {
        //6--->1,2,3 = 6
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not perfect number");
        }
    }
}