    package Training7;

    public class EmployeeDriver {
        public static void main(String[] args) {
            Employee e1 = new Employee();
            System.out.println(e1.hashCode());

            Employee2 e2 = new Employee2();
            System.out.println(e2.hashCode());
        }
    }