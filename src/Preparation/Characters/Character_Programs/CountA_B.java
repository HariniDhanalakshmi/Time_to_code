package Preparation.Characters.Character_Programs;

import java.util.Scanner;
/*Count 2 values

output
Enter string: JAVA programming
Count of a: 3
Count of O: 1
*/
public class CountA_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int countA = 0,countO = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A' || c == 'a')
                countA++;
            else if(c=='0' || c=='o')
                countO++;
        }
        System.out.print("Count of a: "+countA +"\n" +"Count of O: " +countO );
    }

}
