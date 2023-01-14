import java.util.*;
public class SelectionSort {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elments:");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int index = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          index = j;

        }
      }

      int temp = arr[i];
      arr[i] = min;
      arr[index] = temp;
    }
    System.out.println("sorted array is:");
    for (int x: arr) {
      System.out.print(x + " ");
    }
  }

}