//A user adds several items to a shopping cart. You need to keep track of the total cose
package Training1;

public class Totcost {
    public static void main(String[] args) {
        int cost = 25;
        System.out.println("Cost of soap: " +cost);
        cost = cost + 100;
        System.out.println("Added cost of face wash: " +cost);
        cost = cost + 150;
        System.out.println("Added cost of shampoo: " +cost);
        cost = cost - 10;
        System.out.println("Total amount of items: " +cost);
    }
}
