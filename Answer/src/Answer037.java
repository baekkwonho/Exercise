

public class Answer037 {

  public static void main(String[] args) {

    int i = 2;
    int j = 1;

    while (i <= 9) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      System.out.println();
      i ++;
      if (i % 3 == 0) {
        i ++;
      }
    }

  }
}
