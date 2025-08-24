package Training9;

public class Rightshiftval {
    public static void main(String[] args) {
        //shifting the place of array
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[arr.length -1];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("Right Shifted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
