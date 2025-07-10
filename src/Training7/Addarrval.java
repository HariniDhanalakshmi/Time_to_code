package Training7;

public class Addarrval {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum = sum+arr[i];
        }
        System.out.println("Sum of array values: " +sum);
    }
}
