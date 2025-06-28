package Training2;

public class unary {
    public static void main(String[] args) {
        int x = 6;
        int y =5;
        int z = x+++y+++y+++--y+x--;
        int res =  x+y+++z++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(res);
    }
}
