package Assignments;

import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prod = 1;
        int summ = 0;

        for (; n > 0; n /= 10) {
            prod *= n % 10;
            summ += n % 10;
        }
        int result = prod - summ;
        System.out.println("Result: " +result);
    }
}
