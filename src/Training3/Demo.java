package Training3;

public class Demo {
    public static void main(String[] args) {
        /*to input marks of 5 subjects physics, chemistry,
         biology, mathematics and computer  calculate % and grade
         according to following if % >= 90 grade A, if % >=80 grade B,
          if %>=70 grade C , if %>= 60 grade D, if % >=40 grade E, if % < 40 fail
         */
        int phy = 90, che = 95, bio = 43, mat = 65, com =76;
        int avg = (phy+che+bio+mat+com)/5;
        System.out.println("Percentage of marks: "+avg);
        if(avg >= 90) {
            System.out.println("Grade A");
        } else if (avg >= 80) {
            System.out.println("Grade B");
        } else if (avg >= 70) {
            System.out.println("Grade C");
        } else if (avg >= 60) {
            System.out.println("Grade D");
        } else if (avg >= 40) {
            System.out.println("Grade E");
        } else if (avg < 40) {
            System.out.println("Fail");
        }
    }
}
