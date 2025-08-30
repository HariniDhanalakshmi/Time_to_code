package Preparation.Characters;

public class Character_Concepts {
    public static void main(String[] args) {
        //char to ASCII
        char ch = 'A';
        int n = (int)ch;
        System.out.println(n);//65

        //ASCII to char
        int i = 97;
        char c = (char)i;
        System.out.println(c); //a

        //Uppercase to lowercase +32
        char ch1 = 'A';
        ch1+=32;
        System.out.println(ch1); //a  65+32 = 97 = 'a'

        //lowercase to uppercase -32
        char ch2 = 'a';
        ch2-=32;
        System.out.println(ch2); //A  97-32=65 = 'A'

        //Arithmetic operations
        char ch3 = 'A';
        ch3++;
        System.out.println(ch3); //B

    }
}
