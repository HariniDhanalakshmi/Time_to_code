package Assignments;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Area of rhombus = b*h
        System.out.println("Enter breadth: ");
        float b = in.nextFloat();
        System.out.println("Enter height: ");
        float h = in.nextFloat();
        float area =  b * h;
        System.out.println("Area of Rhombus: " +area);
    }
}
