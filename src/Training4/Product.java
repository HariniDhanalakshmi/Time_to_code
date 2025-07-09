package Training4;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a =1;
        for(int i= n1; i<= n2; i++){
            if(i%2 != 0)
                a = a*i;
        }
        System.out.println("Sum of even numbers : " +a);
    }
}
