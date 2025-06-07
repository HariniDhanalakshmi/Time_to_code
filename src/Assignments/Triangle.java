package Assignments;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Area of Triangle = 0.5*b*h
        System.out.print("Enter the value of breadth: ");
        float breadth = input.nextFloat();
        System.out.print("Enter the value of height: ");
        float height = input.nextFloat();
        float area = (float)0.5 * breadth * height;
        System.out.println("Area of Triangle: " +area);
    }
}
