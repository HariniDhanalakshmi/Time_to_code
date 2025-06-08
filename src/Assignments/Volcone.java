package Assignments;

import java.util.Scanner;

public class Volcone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Volume of a cone = 1/3 * 3.14 * radius * radius * height
        System.out.print("Enter radius: ");
        float radius = in.nextFloat();
        System.out.print("Enter height: ");
        float height = in.nextFloat();
        float volume = (float) ((1.0/3)* 3.14 * radius * radius * height);
        System.out.println("Volume of Cone: " +volume);
    }
}
