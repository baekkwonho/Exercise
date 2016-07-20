package answer;
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

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
*/

public class Answer020 {
  public static void main(String[] args) {

    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i*j);
      }
      System.out.println();
    }

  }
}
