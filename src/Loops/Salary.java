package Loops;
public class Salary {
    public static void main(String[] args) {
        int salary = 25000;
        if (salary > 20000){
            salary = salary + 2500;
        }
        else if(salary > 10000){
            salary = salary + 1500;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }

}
