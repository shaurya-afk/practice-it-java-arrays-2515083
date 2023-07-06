import java.util.Arrays;

public class App {
  public static int findSecondSmallestItem(Integer[] arr) {
    int smallest = Integer.MAX_VALUE;
    int second_smallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length - 1; i++) {
      int current = arr[i];
      if (current < smallest) {
        second_smallest = smallest;
        smallest = current;
      } else if (current < second_smallest && current != smallest) {
        second_smallest = current;
      }
    }
    if (second_smallest == Integer.MAX_VALUE) {
      return (Integer) null;
    }
    return second_smallest;
  }

  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 8, 3, 2, 6 };
    int len = arr.length;

    if (len <= 1) {
      System.out.println("null");
    } else {
      Arrays.sort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] != arr[i + 1]) {
          System.out.println(arr[i + 1]);
          break;
        }
      }
    }
  }
}