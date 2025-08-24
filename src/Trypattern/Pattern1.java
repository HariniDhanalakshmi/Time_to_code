package Trypattern;
public class Pattern1 {
    public static void main(String[] args) {
        /*
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         */
        /*
        outer loop = i
        inner loop = j
        i=1 n=5 j=1,2,3,4,5
        i=2 n=5 j=1,2,3,4,5
        i=3 n=5 j=1,2,3,4,5
        i=4 n=5 j=1,2,3,4,5
        i=5 n=5 j=1,2,3,4,5

         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
