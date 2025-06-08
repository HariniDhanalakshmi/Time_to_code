package Assignments;

import java.util.Scanner;

public class Volsphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Volume of sphere = 4/3 * 3.14 * r * r * r
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        float vol = (float) (4.0/3 * 3.14 * r * r * r);
        System.out.println("Volume of sphere: " +vol);

    }
}
