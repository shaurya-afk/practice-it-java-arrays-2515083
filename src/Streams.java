import java.util.Arrays;

public class Streams {
  public static void main(String[] args) {
    int[] arr = { 9, 1, 4, 5, 7, 2 };
    Arrays.stream(arr).forEach(System.out::println);
  }
}
