package Assignments;

import java.util.Scanner;

public class Peripara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Perimeter of parallelogram = 2×(a+b)
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        int perimeter = 2*(a+b);
        System.out.println("Perimeter of parallerlogram: " +perimeter);
    }
}
