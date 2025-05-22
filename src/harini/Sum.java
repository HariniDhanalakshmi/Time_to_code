package harini;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        //One method
        int a = 54, b = 43, sum;
        sum = a+b;
        System.out.println("Sum : " +sum);
        // other method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float firstnum = input.nextFloat();
        System.out.print("Enter yout second number: ");
        float secondnum = input.nextFloat();
        float Add;
        Add = firstnum + secondnum;
        System.out.println("Add : " +Add);
    }
}
