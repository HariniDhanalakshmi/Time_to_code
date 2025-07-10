package Operators;

public class Bitwise {
    public static void main(String[] args) {
        /*
        m=60 and n = 13
        m & n = 12
        m | n = 61
        m ^ n = 49
        m << 2 = 240
        m << 2 = 15
        m << 2 = 15
        ~m = -61
         */
        int m = 60; // 60 = 0011 1100
        int n = 13; // 13 = 0000 1101
        int p = 0;
        System.out.println("m="+m +" and n = "+n);
        p = (m&n); //12 = 0000 1100
        System.out.println("m & n = " +p );
        p = (m | n); //61 = 0011 1101
        System.out.println("m | n = " +p );
        p = (m ^ n); //49 = 0011 0001
        System.out.println("m ^ n = " +p );
        p = (m << 2); //240 = 1111 0000
        System.out.println("m << 2 = " +p );
        p = (m >> 2); //215 = 1111
        System.out.println("m << 2 = " +p );
        p = (m >>> 2); //215 = 0000 1111
        System.out.println("m << 2 = " +p );
        p = (~m); // 61 = 1100 0011
        System.out.println("~m = " +p);
    }
}
