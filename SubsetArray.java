import java.util.*;
public class SubsetArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println(" enter the elements of array1");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the sub array size");
    int size1 = sc.nextInt();
    int[] subarr = new int[size1];
    System.out.println("enter the elements of sub array");
    for (int i = 0; i < subarr.length; i++) {
      subarr[i] = sc.nextInt();
    }
    SubsetArray s = new SubsetArray();
    boolean res = s.subSet(arr, subarr);
    if (res) {
      System.out.println("it is a subset");
    }
  }

  public boolean subSet(int[] arr1, int[] arr2) {

    Arrays.sort(arr1);

    for (int i = 0; i < arr2.length; i++) {
      int target = arr2[i];
      int low = 0;
      int high = arr1.length - 1;
      while (low <= high) {
        int mid = (low + high) / 2;
        if (arr1[mid] == target) {

          break;
        } else if (target > arr1[mid]) {
          low = mid + 1;
        } else if (target < arr1[mid]) {
          high = mid - 1;
        }
      }
      if (low > high) {
        System.out.println("Not a subset");
        return false;
      }
    }
    return true;
  }

}