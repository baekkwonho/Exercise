package Answer;
/*
2 * 1 = 2
2 * 3 = 6
2 * 5 = 10
2 * 7 = 14
2 * 9 = 18

3 * 2 = 6
3 * 4 = 12
3 * 6 = 18
3 * 8 = 24

4 * 1 = 4
4 * 3 = 12
4 * 5 = 20
4 * 7 = 28
4 * 9 = 36

5 * 2 = 10
5 * 4 = 20
5 * 6 = 30
5 * 8 = 40

6 * 1 = 6
6 * 3 = 18
6 * 5 = 30
6 * 7 = 42
6 * 9 = 54

7 * 2 = 14
7 * 4 = 28
7 * 6 = 42
7 * 8 = 56

8 * 1 = 8
8 * 3 = 24
8 * 5 = 40
8 * 7 = 56
8 * 9 = 72

9 * 2 = 18
9 * 4 = 36
9 * 6 = 54
9 * 8 = 72
*/
public class Answer032 {

  public static void main(String[] args) {

    for (int i = 2; i <= 9; i++) {
      if ( i % 2 == 0) {
        for (int j = 1; j <= 9; j +=2) {
          System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
        System.out.println();
      } else {
        for (int j = 2; j <= 9; j +=2) {
          System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
        System.out.println();
      }
    }

  }
}
