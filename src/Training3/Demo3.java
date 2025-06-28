package Training3;

public class Demo3 {
    public static void main(String[] args) {
        //leap or not
        int year = 1900;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
