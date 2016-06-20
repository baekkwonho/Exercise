

public class Answer014 {

  public static void main(String[] args) {

    int[] numbers = {1, 4, 16, 64, 254};
    boolean flag = false;

    for (int i = 2; i < numbers.length; i++) {
      if ( numbers[0] * numbers[i] == numbers[1] * numbers[i-1]) {
        flag = true;
        break;
      }
    }

    System.out.printf("{");
    for (int i = 0; i < numbers.length; i++) {
      if ( i == numbers.length - 1 ) {
        System.out.printf("%d",numbers[i]);
      } else {
        System.out.printf("%d, ",numbers[i]);
        }
    }
      if (flag == true) {
        System.out.printf("} : 등비수열이다.\n");
      } else {
        System.out.printf("} : 등비수열이 아니다. \n");

    }

  }
}
