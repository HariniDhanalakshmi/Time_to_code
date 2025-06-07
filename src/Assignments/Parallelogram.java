package Assignments;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //Area of parallelogram = bh
        System.out.print("Enter breadth: ");
        int b = in.nextInt();
        System.out.print("Enter height: ");
        int h = in.nextInt();
        int area = b*h;
        System.out.print("Area of Parallelogram: " +area);
    }
}
