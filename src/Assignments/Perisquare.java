package Assignments;

import java.util.Scanner;

public class Perisquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Perimeter of a square = 4*a
        System.out.print("Enter the side: ");
        int side = in.nextInt();
        int peri = 4*side;
        System.out.println("Perimeter of a square: " +peri);
    }
}
