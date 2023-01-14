import java.util.*;

public class BubbleSort {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements:");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
    System.out.println("Sorted array is");
    for (int x: arr) {
      System.out.print(x + " ");
    }

  }
}