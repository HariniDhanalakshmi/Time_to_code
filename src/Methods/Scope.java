package Methods;

public class Scope {
    public static void main(String[] args) {
        //Anything that is initialized inside the block can be used inside the block
        //But anything that is initialized inside the block cannot be used outside the block
        int a = 10;
        int b = 20;
        String name = "Harini";
        {
            //int a = 7;already initialized outside the block in the same method, hence you cannot initialize again
            a = 100;//reassign the original ref variable to some other value
            System.out.println(a);
            System.out.println(name);
            int c = 99;

            //value initialized in this block, will remain in same block
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);cannot be used outside the block

        //Scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            //int a = 10;
        }
        //System.out.println(i);
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

