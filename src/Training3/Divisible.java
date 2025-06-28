package Training3;
public class Divisible {
    public static void main(String[] args) {
        //write a java prg to check if number is divisible by 5 and 11 or not
        int num = 55;
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
