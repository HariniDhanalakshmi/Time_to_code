package Assignments;

import java.util.Scanner;

public class Volprism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Volume of rectangular prism = Base*height
        //Base=length * width
        System.out.print("Enter length: ");
        int l = in.nextInt();
        System.out.print("Enter width: ");
        int b = in.nextInt();
        System.out.print("Enter height ");
        int h = in.nextInt();
        int vol = l * b * h;
        System.out.println("Volume of rectangular prism: " +vol);
    }
}
