package Methods;

public class Test {
//    int add(int a,int b){
//        int sum = a+b;
//        System.out.println("Without return:" +sum);
//        return sum;
//    }
    double multiply(double m,double n){
        double mull = m*n;
        return mull;
    }
    public static void main(String[] args) {
        Test obj = new Test();
//        int summ = obj.add(3,5);
//        System.out.println("With return:" +summ);
        double cal = obj.multiply(3.9,2.8);
        System.out.println(cal);
    }
}
