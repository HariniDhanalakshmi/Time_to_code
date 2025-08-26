package Preparation;

import java.util.Scanner;

/*
19 → 1² + 9² = 82
82 → 8² + 2² = 68
68 → 6² + 8² = 100
100 → 1² + 0² + 0² = 1  ✅ Happy number

Enter number: 19
19 is a Happy number
 */
public class HappyNumberr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = n;
        while (num != 1 && num != 4){
            int sum = 0;
            int temp = num;

            while (temp > 0){
                int digit = temp % 10;
                sum = sum + (digit*digit);
                temp = temp / 10;
            }
            num = sum;
        }
        if(num == 1)
            System.out.println(n+" is a Happy number");
        else
            System.out.println(n+ " is not a happy number");
    }
}
