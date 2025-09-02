package Preparation.String.String_Methods.StringPrograms;

import java.util.Scanner;

/*
Change RED WITH BLUE IN A SENTENCE AND PRINT IT

OUTPUT
Enter the string:
THIS IS RED COLOR
THIS IS BLUE COLOR
 */
public class ChangeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String word = "";
        s+= " ";
        String newString= "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' '){
                word += ch;
            }
            else{
                if(word.equals("RED")) {
                    newString = newString + "BLUE" + " ";
                }
                else {
                    newString = newString + word + " ";
                }
                word = "";
            }
        }
        System.out.print(newString);
    }
}
