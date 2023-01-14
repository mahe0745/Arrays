import java.util.*;
public class QuickSort {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    QuickSort q = new QuickSort();
    int low = 0;
    int high = arr.length - 1;
    q.sort(arr, low, high);
    System.out.println("sorted array is:");
    for (int x: arr) {

      System.out.print(x + " ");
    }

  }
  public void sort(int[] arr, int low, int high) {
    if (low >= high) {
      return;
    }
    int start = low;
    int end = high;
    int mid = (start + end) / 2;
    int pivot = arr[mid];
    while (start <= end) {
      while (arr[start] < pivot) {
        start++;
      }
      while (arr[end] > pivot) {
        end--;
      }
      if (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    sort(arr, low, end);
    sort(arr, start, high);
  }

}