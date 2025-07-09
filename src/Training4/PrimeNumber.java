package Training4;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int num = 4;
        for (int i = 1; i < num ; i++) {
            if(num % i == 0){
                count++;
            }
        }
            if(count == 2){
                System.out.println("Given number is Prime");
            }
            else {
                System.out.println("Not Prime number");
            }
    }
}
