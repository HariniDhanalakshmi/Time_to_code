package Assignments;

import java.util.Scanner;

public class Perirhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Peri of rhombus = 4 * a
        System.out.print("Enter the side: ");
        int side = in.nextInt();
        int peri = 4 * side;
        System.out.println("Perimeter of a rhombus: " +peri);
    }
}
