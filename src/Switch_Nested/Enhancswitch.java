package Switch_Nested;

import java.util.Scanner;

public class Enhancswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            case "Apple" -> System.out.println("Red colour fruit");
            default -> System.out.println("Enter the correct fruit name");
        }
    }
}
