package Training2;

public class Onlineresult {
    public static void main(String[] args) {
        int marks = 90;
        int timeTaken = 39;
        int allowedTime = 60;
        boolean isPass = marks > 50 && timeTaken < 60;
        System.out.println(isPass);

    }
}
