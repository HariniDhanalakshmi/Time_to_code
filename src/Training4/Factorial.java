package Training4;

public class Factorial {
    // 4! = 1*2*3*4 = 24
    public static void main(String[] args) {
        int a = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        System.out.println(a);
    }
}
