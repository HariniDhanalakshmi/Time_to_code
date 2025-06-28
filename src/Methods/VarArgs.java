package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,23,34,2,2,32,34,342);
        name("Harini","Lathika","Arun","Appa","Amma");
        biscuit(2,3,"name","family","street");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void name(String ...a){
        System.out.println(Arrays.toString(a));
    }
    static void biscuit(int a,int b, String ...c){
        System.out.println("a: " + a + ", b: " + b + ", c: " + Arrays.toString(c));

    }
}
