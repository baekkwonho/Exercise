package answer;
/*
2 * 1 = 2
2 * 3 = 6
2 * 5 = 10
2 * 7 = 14
2 * 9 = 18

4 * 1 = 4
4 * 3 = 12
4 * 5 = 20
4 * 7 = 28
4 * 9 = 36

6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54

8 * 1 = 8
8 * 3 = 24
8 * 5 = 40
8 * 7 = 56
8 * 9 = 72
*/

public class Answer030 {

  public static void main(String[] args) {


    System.out.println("=======1번째 방법========");

    for (int i = 2; i < 9; i += 2) {
      for (int j = 1; j <= 9; ) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);

        if (i == 6) {
          j++;
        } else {
          j += 2;
        }

      }
      System.out.println();
    }



    System.out.println("=======2번째 방법========");

    for (int i = 2; i < 9; i++) {
      for (int j = 1; j <= 9; j+= ((i == 6) ? 1 : 2)) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
      System.out.println();

    }


  }
}
