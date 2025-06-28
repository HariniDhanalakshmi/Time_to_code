package Methods;

import java.util.Arrays;

public class FunOverloading {
    public static void main(String[] args) {
        fun(32);
        fun("Harini", 34);
        int ans= sum(392, 932);
        System.out.println(ans);
        int res = product(43, 43,5);
        System.out.println(res);
        demo(34,34,54,65,76);
        demo("Harini", "Arun", "DairyDay");
    }
    static int sum(int a, int b ){
        return a+b;
    }
    static int product(int a , int b, int c){
        return a*b*c;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);

    }
    static void fun(String name, int a){
        System.out.println("Second one");
        System.out.println(name +" " +a);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
