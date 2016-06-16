

public class Answer30 {

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
