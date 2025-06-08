package Assignments;

import java.util.Scanner;

public class CSAcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //CSA of cylider = 2πrh
        System.out.print("Enter radius: ");
        int r = in.nextInt();
        System.out.print("Enter height: ");
        int h = in.nextInt();
        float CSA = (float) (2*3.14*r*h);
        System.out.println("CSA of cylinder: " +CSA);
    }
}
