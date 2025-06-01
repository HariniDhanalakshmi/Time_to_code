package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if(a >= 'a'&& a <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}
