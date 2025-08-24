package Training8;

import java.util.ArrayList;
import java.util.Iterator;

public class Prg4 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(23);
        ls.add(33);
        ls.add(56);
        ls.add(65);
        ls.add(87);
        Iterator i = ls.iterator();
//        System.out.println(i.next());
//        System.out.println(i.next());
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
