package Assignments;

import java.util.Scanner;

public class Periequitriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Perimeter of an Equilateral Triangle = 3 * a
        System.out.print("Enter side: ");
        int side = in.nextInt();
        int perimeter = 3 * side;
        System.out.println("Area of an Equilateral Triangle: " +perimeter);
    }
}
