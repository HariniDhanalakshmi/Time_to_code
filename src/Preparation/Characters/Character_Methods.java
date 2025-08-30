package Preparation.Characters;

public class Character_Methods {
    public static void main(String[] args) {

        //Character.isLetter()
        System.out.println(Character.isLetter('c')); //true
        System.out.println(Character.isLetter(23)); //false
        System.out.println(Character.isLetter('4')); //false
        System.out.println(Character.isLetter((char)78)); //true
        System.out.println(Character.isLetter('\n')); //false

        //Character.isDigit()
        System.out.println(Character.isDigit('c')); //false
        System.out.println(Character.isDigit('3')); //true
        System.out.println(Character.isDigit((char) 32)); //false
        System.out.println(Character.isDigit('\t')); //false

        //isLowerCase() / isUpperCase()
        System.out.println(Character.isLowerCase('c')); // true
        boolean b = Character.isLowerCase('C');
        System.out.println(b); //faslse
        System.out.println(Character.isUpperCase('c')); //false
        System.out.println(Character.isUpperCase('\n')); //false
        System.out.println(Character.isUpperCase('C')); //true

        //character.isWhiteSpace()
        System.out.println(Character.isWhitespace('d')); //false
        System.out.println(Character.isWhitespace('\n')); //true
        System.out.println(Character.isWhitespace('\t')); //true
        System.out.println(Character.isWhitespace(' ')); //true

        //toUpperCase() & tpLowerCase()
        System.out.println(Character.toUpperCase('c')); //C
        System.out.println(Character.toUpperCase((char) 97)); //A
        System.out.println(Character.toLowerCase((char) 65)); //a
        System.out.println(Character.toLowerCase('D')); //d

        //toString()
        String  str = Character.toString('A');
        System.out.println(str);

        //Primitive types of string  --> Return type
        String s1 = String.valueOf("true");   //boolean
        String s2 = String.valueOf('A'); //char
        String s3 = String.valueOf(23.2); //float
        String  s4 = String.valueOf(23); //int
    }

}
