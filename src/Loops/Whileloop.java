package Loops;
import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        int num = 1;
        while(num < 5) {
            System.out.println(num);
            num++;
        }
        //print odd numbers
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 1;
        while(b < a){
            System.out.println(b);
            b += 2;
        }
    }
}
