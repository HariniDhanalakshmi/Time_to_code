package Switch_Nested;

import java.util.Scanner;

public class Fruitswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            case "Apple":
                System.out.println("Red colour fruit");
                break;
            default:
                System.out.println("Enter the correct fruit name");
        }
    }
}

