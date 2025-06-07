package Assignments;

import java.util.Scanner;

public class Equitriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Area of equilateral triangle = (sqrt3/4)*side*side
        System.out.print("Enter side: ");
        float side = in.nextFloat();
        float area = (float) (Math.sqrt(3)/4) * side * side;
        System.out.println("Area of Equilateral triangle: " +area);
    }
}
