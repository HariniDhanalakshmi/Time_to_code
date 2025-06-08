package Assignments;

import java.util.Scanner;

public class Volpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Volume of  square pyramid = 1/3 *a*a*h
        System.out.print("Enter edge: ");
        float a = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        float vol = (float) (1.0 / 3 * a * a * h);
        System.out.println("Volume of square pyramid: " +vol);
    }
}
