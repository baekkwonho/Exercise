package answer;
/*
{1, 2, 4, 7, 11, 9}
합계 : 12 
*/

public class Answer010 {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 4, 7, 11, 9};
    int sum = 0;

    for (int i = 0; i < numbers.length - 1; i++) {
      sum += (Math.abs(numbers[i] - numbers[i + 1]));
    }

    System.out.print("{");

    for (int i = 0; i < numbers.length; i++) {
      if ( i > 0 ) {
      System.out.printf(", %d", numbers[i]);
      } else {
      System.out.printf("%d", numbers[i]);
      }
    }

    System.out.printf("}\n");
    System.out.printf("합계 : %d \n", sum);

  }
}
