package Training7;

    class Student {
        String name = "Alia";

        @Override
        public String toString() {
            return name;
        }
    }
    class Student2 {
        String name = "Pooja";
    }
    public class Tostring {
        public static void main(String[] args) {
            Student s1 = new Student();
            System.out.println(s1);
            Student2 s2 = new Student2();
            System.out.println(s1.toString());
            }
        }

