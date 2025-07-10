package Training7;

public class Proarrval {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int pro = 1;
        for (int i = 0; i <= 3; i++) {
            pro = pro * arr[i];
        }
        System.out.println(pro);
    }
}
