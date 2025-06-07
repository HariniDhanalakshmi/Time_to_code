package Assignments;

import java.util.Scanner;

public class Pericircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Perimeter of a circle = 2 * 3.14 * r
        System.out.print("Enter radius: ");
        float radius = in.nextFloat();
        float perimeter = (float) (2*3.14*radius);
        System.out.println("Perimeter of a circle: " +perimeter);
    }
}
