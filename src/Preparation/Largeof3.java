package Preparation;

import java.util.Scanner;
//Greatest of three numbers
public class Largeof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int  a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int  b = sc.nextInt();
        System.out.print("Enter the value of C: ");
        int  c = sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+ " is Largest");
        else if (b>a && b>c)
            System.out.println(b+ " is Largest");
        else
            System.out.println(c+ " is Largest");


        //conditional operator
        int res = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.print(res);
    }
}
