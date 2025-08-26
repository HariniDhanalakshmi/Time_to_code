package Preparation.Arithmetic;

import java.util.Scanner;

//10+9+8...N
public class Series10_9_8_n{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num: ");
    int n = sc.nextInt();
    int sum =0;
    for (int i = 10; n <=i ; i--) {
      sum += i;
      System.out.println(i +" ");
    }
    System.out.println("Sum of series: " +sum);
  }
}
