package Assignments;

import java.util.Scanner;

public class TSAcube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //TSA of cube = 6*a*a
        System.out.print("Enter side: ");
        int a = in.nextInt();
        int TSA = 6*a*a;
        System.out.println("TSA of Cube: " +TSA);
    }
}
