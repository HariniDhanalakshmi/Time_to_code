package Preparation;

import java.util.Scanner;

//Print all the prime numbers within given range
public class PrintAllPrimeinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            if (n > 1) {
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                    }

                }
                if(count == 2){
                    System.out.println(n);
                }
            }
        }
    }
}
