package Assignments;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Area Of Circle = 3.14*r*r
        System.out.print("Enter the radius: ");
        float r = in.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println("Area of Circle: " +area);
    }
}
