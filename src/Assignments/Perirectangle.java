package Assignments;

import java.util.Scanner;

public class Perirectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Perimeter of a rectangle= 2(l+b)
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = input.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of a rectangle: " +perimeter);
    }
}
