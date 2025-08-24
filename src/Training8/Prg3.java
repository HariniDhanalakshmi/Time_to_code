package Training8;
import java.util.ArrayList;
public class Prg3 {
    public static void main(String[] args) {
        ArrayList<String> SouthMenu = new ArrayList<>();
        SouthMenu.add("Idli");
        SouthMenu.add("Dosa");
        SouthMenu.add("Pongal");
        SouthMenu.add("Biriyani");
        ArrayList<String> NorthMenu = new ArrayList<>();
        NorthMenu.add("Aalu Paratha");
        NorthMenu.add("Chole Bhatore");
        NorthMenu.add("Puran Poli");
        NorthMenu.add("Chicked Kolhapur");
        System.out.println("South Indian Dishes");
        System.out.println(SouthMenu);
        System.out.println("North Indian Dishes");
        System.out.println(NorthMenu);

        ArrayList<String> menu=new ArrayList<>();
        menu.addAll(SouthMenu);
        menu.addAll(NorthMenu);
        System.out.println("Menu card");
        System.out.println(menu);
    }
}
