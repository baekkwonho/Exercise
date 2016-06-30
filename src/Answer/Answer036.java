package Answer;
/*
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36

8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
*/

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
