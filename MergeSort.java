import java.util.*;
public class MergeSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    arr = Sort.mergeSort(arr);
    System.out.println("Sorted array is");
    for (int x: arr) {
      System.out.print(x + " ");
    }

  }

}

class Sort {

  public static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
  }
  public static int[] merge(int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] joined = new int[left.length + right.length];
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        joined[k] = left[i];
        k++;
        i++;
      } else {
        joined[k] = right[j];
        k++;
        j++;
      }
    }
    while (i < left.length) {
      joined[k] = left[i];
      k++;
      i++;

    }
    while (j < right.length) {
      joined[k] = right[j];
      k++;
      j++;
    }
    return joined;
  }

}