package Preparation.Characters.Character_Programs;

import java.util.Scanner;

/*
STRING ENCODING PROGRAM - PIGLATIN
Enter the String:
CLEAR
EARCLAY

EAT
EATWAY
 */
public class Piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String pl = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            char u = Character.toUpperCase(ch);
            if(u=='A' || u=='E' || u=='I' || u=='O' || u=='U'){
                if(i == 0){
                    pl = str+ "WAY";
                    System.out.println(pl);
                    break;
                }
                else
                    pl = str.substring(i)+str.substring(0,i)+"AY";
                    System.out.println(pl);
                    break;
            }

        }

    }
}
