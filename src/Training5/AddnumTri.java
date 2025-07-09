package Training5;

public class AddnumTri {
    public static void main(String[] args) {
        int n = 5, n1= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n1 +" ");
                n1++;
            }
            System.out.println();
        }
    }
}
