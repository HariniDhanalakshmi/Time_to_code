package harini;

import java.util.Scanner;

public class Typeconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int nums = input.nextInt();
        System.out.println(nums);

        //Type casting
        int as = (int)(23.43f);
        System.out.println(as);

        //automatic type promotion in expressions
        int aa = 257;
        byte bs = (byte)(aa); //257 % 256 = 1

        byte aaa = 25;
        byte bbb = 30;
        byte cs = 10;
        int ds = aaa * bbb / cs;
        System.out.println(ds);

        int s = 3;
        s = s * 2;
        System.out.println(s);

        int number = 'a';
        System.out.println(number);
        int numb = 'A';
        System.out.println(numb);

        System.out.println("नमस्ते");
        System.out.println("Салам дæ уæд");

        System.out.println(3 * 434.2525425323F);

        byte b = 34;
        char c = 'a';
        short ss = 1024;
        int i = 343489;
        float f = 43.232f;
        double d = 9.323;
        double result = (f-b) + (i/c) - (d*ss);
        //float + int - double = double
        System.out.println((f * b) + " " + (i/c) + "" + (d*ss));
        System.out.println(result);
    }
}
