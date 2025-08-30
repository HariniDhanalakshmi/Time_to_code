package Preparation.String.String_Methods;

public class Manipulate_methods {
    public static void main(String[] args) {

        //trim()
        String s1 = " This is a text ";
        String s2 = s1.trim();
        System.out.println(s2); //This is a text
        s1 = s1.trim();
        System.out.println("Hi"+s1+"Hi"); //HiThis is a textHi

        //toLowerCase() / toUpperCase()
        String s21 = "I am Harini";
        String s3 = s21.toLowerCase();
        String s4 = s2.toUpperCase();
        System.out.println(s2+"\n"+s3+"\n"+s4);
        /*
        I am Harini
        i am harini
        I AM HARINI
         */

        //concat()
        String s5 = "I am Harini";
        String s6 = "Learning java";
        System.out.println(s5.concat(s6)); //I am HariniLearning java
        String s7 = s5+s6;
        System.out.println(s7); //I am HariniLearning java

        //replace()
        String s8 = "This is a sample";
        String s9 = s8.replace('a','k');
        System.out.println(s9); //This is k skmple
        String s10 = s8.replace("is","was");
        System.out.println(s10);   //Thwas was a sample

        //substring()
        String s11 = "This is a string";
        String s12 = s11.substring(5,7);
        System.out.println(s12);  //is
        String s13 = s11.substring(8);
        System.out.println(s13); // a string

        //charAt()
        String s14 = "HELLO";
        char ch = s14.charAt(3);
        System.out.println(ch); //L
        char ch1 = s14.charAt(6);
        System.out.println(ch1);  //StringIndexOutOfBoundsException


    }
}
