package Loops;
import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a < 5);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter b: ");
        int b = input.nextInt();
        do {
            System.out.print(b+ " ");
            b++;
        } while(b < 5);
        int c = 1;
        do{
            System.out.println(c);
        }while(c != 1);
        }
    }
