package Preparation.Geometric;

import java.util.Scanner;

/*
2+4+8+16....N

output
Enter the number: 18
Sum: 30
 */
public class Series2_4_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i<=n ; i*=2) {
            sum += i;
        }
        System.out.println("Sum: " +sum);
    }
}
