package Training2;

public class Ticket {
    public static void main(String[] args) {
        int age = 16;
        String result;
        result = age < 12 || age > 60 ? "eligible for discount" : "not elligible discount";
        System.out.println(result);
    }
}
