package Preparation.String.String_Methods;

public class Position_Methods {
    public static void main(String[] args) {

        //length()
        String s1 = "Hello";
        int length = s1.length();
        System.out.println(length); //5

        //indexOf()
        String s2 = "This is to test";
        int i = s2.indexOf('e');
        System.out.println(i); //12

        //lastIndexOf()
        String s3 = "This is one of string";
        int i2 = s3.lastIndexOf('i');
        System.out.println(i2); //18
        int i3  = s3.lastIndexOf("is", 4);
        System.out.println(i3); //2

        //compareTo()
        /*
        if equal return 0
        if 1st string has more then return positive count
        if 2nd string is more negative return value
         */
        String s4 = "This is a string ";
        String  s5 = "This is a string";
        int i4 = s4.compareTo(s5);
        System.out.println(i4); //0


    }
}
