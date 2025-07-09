package Training4;

public class Factors {
    //Factors of given number   6>> 1,2,3,6
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <=n; i++) {
            if(n % i == 0 )
                System.out.print(i+ " ");
                }
            }

        }

//import java.util.Scanner;
//
//public class Factors {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Factors of " + n + " are:");
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//                if (i != n / i) { // avoid repeating square root twice
//                    System.out.print((n / i) + " ");
//                }
//            }
//        }
//    }
//}

