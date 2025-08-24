package Training9;

public class Reverarr {
    public static void main(String[] args) {
        //reversing array
        int[] arr = {10,20,50,30,70};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int temp = 0;
        for (int start = 0, end = arr.length-1; start < end ; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");

        }
    }
}
