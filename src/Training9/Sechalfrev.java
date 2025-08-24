package Training9;

public class Sechalfrev {
    public static void main(String[] args) {
        //second half reversing
        int[] arr = {10,25,30,50,70};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int temp = 0;
        for (int start = 2, end = arr.length-1; start < end ; start++, end--) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
        }
        System.out.println("After Sorting second half");
        for (int i = 2; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
    }
}
