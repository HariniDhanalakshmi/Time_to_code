package Preparation.Characters.Character_Programs;


import java.util.Scanner;

/*Program to count vowels
output
Enter String : 1JAva programming2
Count vowels= 5
Count space: 1
Count Digit: 2
 */

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String ch = sc.nextLine();
        int count_vow = 0,count_space=0,count_digit = 0;

        for (int i = 0; i < ch.length() ; i++) {
            char c = ch.charAt(i);
            c = Character.toLowerCase(c);
            if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                count_vow++;
            if(c == ' ')
                count_space++;
            if(Character.isDigit(c))
                count_digit++;
        }
        System.out.println("Count vowels= "+count_vow);
        System.out.println("Count space: " +count_space);
        System.out.println("Count Digit: " +count_digit);
    }
}
