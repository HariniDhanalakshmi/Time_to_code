package Training8;

import java.util.ArrayList;

public class EmployeeDrive {
    public static void main(String[] args) {
        ArrayList<Employee> em = new ArrayList();
        Employee e1 = new Employee(101, "Harini", 50000);
        em.add(e1);
        em.add(new Employee(102,"Ivana", 55000));
        em.add(new Employee(103,"Aaysha",60000));
        em.add(new Employee(104,"Nagila",65000));
        System.out.println(em);
    }
}
