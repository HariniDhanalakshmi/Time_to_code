package Training9;

public class Firsthalfrev {
    public static void main(String[] args) {
        //first half reversing
        int[] arr = {10,25,30,50,70};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int temp = 0;
        for (int start = 0, end = arr.length/2; start < end ; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println("After Sorting first half");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");

        }
    }
}
