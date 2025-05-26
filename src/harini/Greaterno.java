//Take 2 numbers as input and print the largest number.
package harini;
import java.util.Scanner;
public class Greaterno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("Largest number is : " +num1 );
        }else if(num2>num1){
            System.out.println("Largest number is : " +num2 );
        }else{
            System.out.println("Both numbers are equal");
        }
    }
}
