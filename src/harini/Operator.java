//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package harini;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter the operator(+,-,*,/): ");
        char operator = input.next().charAt(0);
        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Sum :" + result);
        }else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Difference :" + result);
        }else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Product :" + result);
        }else if (operator == '/') {
            if(num2!=0){
            result = num1 / num2;
            System.out.println("Difference :" + result);
            }
            else{
                System.out.println("Error: Cannot be divided by 0");
            }
        }else{
            System.out.println("Invalid operator");
        }
    }
}
