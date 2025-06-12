package Methods;

public class Passargstr {
    public static void main(String[] args) {
        String output = greet("Harini");
        System.out.println(output);

    }
    static String greet (String name){
        String messsage = "Hello " + name;
        return messsage;
    }
}
