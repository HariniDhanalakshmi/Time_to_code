package Assignments;

import java.util.Scanner;

public class Volcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Volume of Cylinder = 3.14 * r * r * h
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        float vol = (float) (3.14 * r * r * h);
        System.out.println("Volume of cylinder: " +vol);
    }
}
