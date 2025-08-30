package Preparation.String.String_Methods;

public class Check_Methods {
    public static void main(String[] args) {

        //contains()
        String s1 = "This is a string";
        boolean b = s1.contains("This");
        System.out.println(b);  //true

        //equals()
        String s = "This is a string";
        String s2 = "This is a String";
        boolean c = s.equals(s2);
        System.out.println(c); //false

        //equalsIgnoreCase()
        String a = "This is a String";
        String d = "This is a string";
        boolean e = a.equalsIgnoreCase(d);
        System.out.println(e); //true

        //startsWith()
        String f = "This is a String";
        boolean g = f.startsWith("Th");
        System.out.println(g);  //true
        boolean h = f.startsWith("is",2);
        System.out.println(h);  //true
        boolean i = f.startsWith("is");
        System.out.println(i); //false

        //endsWith()
        String j = "This is a string";
        boolean k = j.endsWith("ing");
        System.out.println(k); //true
        boolean l = j.endsWith("ds");
        System.out.println(l); //false
    }
}
