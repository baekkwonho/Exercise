

public class Answer036 {

  public static void main(String[] args) {

    int i = 2;
    int j = 1;

    while (i <= 8) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      System.out.println();
      i += 2;
      if (i == 6) {
        i += 2;
      }
    }

  }
}
