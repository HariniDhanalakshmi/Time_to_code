package Patterns;
import java.util.Scanner;
public class Hallowrev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
         *********
          *     *
           *   *
            * *
             *
         */
        /*
        i = 1 spaces = 0 n=5 winlen= 9 space = 2*(n-i+1)-1
        i = 2 spaces = 1 n=5 winlen= 7
        i = 3 spaces = 2 n=5 winlen= 5
        i = 4 spaces = 3 n=5 winlen= 3
        i = 5 spaces = 4 n=5 winlen= 1
        */
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i+1)-1 ; j++) {
                if(i==1 || j==1 || j==2*(n-i+1)-1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
