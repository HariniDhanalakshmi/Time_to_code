package Switch_Nested;
import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();
        switch (empId) {
            case 1 -> System.out.println("Harini");
            case 2 -> System.out.println("Lathika");
            case 3 -> {
                System.out.println("Arun");
                switch (department) {
                    case "IT" -> System.out.println("IT dept");
                    case "Finance" -> System.out.println("Finance dept");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter the correct EmpId");
        }
    }
}