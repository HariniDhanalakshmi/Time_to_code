package Assignments;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Area Of Rectangle
        System.out.print("Enter the length: ");
        int length = in.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = in.nextInt();
        int area = length * breadth;
        System.out.println("Area of rectangle: " +area);
    }
}
