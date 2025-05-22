package harini;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Datatypeinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " +rollno);
        int a = 435_345_345;
        System.out.println(a);
        int aa = input.nextInt();
        System.out.println("Value of a " +aa);
        String name = input.next();
        System.out.println("Your name is : " +name);
        String about = input.nextLine();
        System.out.println("My about : " +about);
        float marks = input.nextFloat();
        System.out.println("My marks : " +marks);
        double number = input.nextDouble();
        System.out.println("Long number : " +number);
        boolean check = input.hasNext();
        System.out.println("Check : " +check);
    }
}
