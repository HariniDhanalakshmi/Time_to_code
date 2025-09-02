package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
OR EXISTS IN THE GIVEN SENTENCE OR NOT

OUTPUT
Enter the string: HAPPY OR SAD
Found
 */

public class ORExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s += " ";
        int count = 0;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if(c!=' '){
                word += c;
            }else {
               if(word.contains("OR"))
                   // if(word.equalsIgnoreCase("OR"))   WE CAN USE ANY ONE OF THE METHOD
                    count++;
                word = "";
            }
        }
        if(count == 0)
            System.out.println("Not found");
        else
            System.out.println("Found");
    }
}
