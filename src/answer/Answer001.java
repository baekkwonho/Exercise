package answer;
/*
1 3 4 6 7 8 9 12 
 */

public class Answer001 {

  static int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};

  public static void main(String[] args) {

    int endIndex = arr.length - 1;

    while (endIndex > 0) {
      for (int i = 0; i < endIndex; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      endIndex--;
    }

    for (int a : arr) {
      System.out.printf("%d ", a);
    }
  }
}

