package Methods;

public class Passingexample {
    public static void main(String[] args) {
        String name = "Chotta bheem";
        greet(name);
    }
    //in java there is no pass by reference only pass by value is present
    static void greet(String naam){ //naam will contain the copy of value in name
        System.out.println(naam);
    }
}
