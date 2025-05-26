//Write a program to input principal, time,and rate (P, T, R) from the user and find Simple Interest.
package harini;
import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pricipal = input.nextInt();
        int time = input.nextInt();
        float rate = input.nextFloat();
        float SI = (pricipal * rate * time) / 100;
        System.out.println("Simple Interest : " +SI);
    }
}
