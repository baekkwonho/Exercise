
public class Answer004 {
  public static void main(String[] args) {

    int number = Integer.parseInt(args[0]);
    int max = number % 10;
    int min = number % 10;

    while (number > 10) {
      if (number % 10 > max) {
        max = number % 10;
      } else if (number % 10 < min) {
        min = number % 10;
      }
      number /= 10;
    }

    System.out.printf("가장 큰 수: %d\n", max);
    System.out.printf("가장 작은 수: %d\n", min);

  }
}
