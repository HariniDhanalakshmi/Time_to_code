package Preparation;

//Print recursive natural numbers
public class NatRecursion {
    public static void main(String[] args) {
        naturalno(10);
    }
    public static void naturalno(int n){
        if(n==2) {
            System.out.println(2);
        }
        else {
            System.out.println(n);
            naturalno(n-1);
        }
    }
}
