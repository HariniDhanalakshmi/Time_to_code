package Training9;

public class Removeele {
    //remove all the operands of the particular elements
    public static void main(String[] args) {
        int[] arr = {10,20,50,30,70};
        int key = 20;
        System.out.println("Given array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Remove elements");
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == key) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
}
