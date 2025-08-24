package Preparation;

public class Evenrecurs {
    public static void main(String[] args) {
        Evenno(20);
    }
    public static void Evenno(int n){
        if(n<2) {
            return;
        }

            Evenno(n-2);
            System.out.println(n);


    }
}
