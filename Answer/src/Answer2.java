
public class Answer2 {

  public static void main(String[] args) {

    int number = Integer.parseInt(args[0]);
    int evenCount = 0, oddCount = 0;

    while (number > 0) {
      if ((number % 10) % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
      number/=10;
    }

    System.out.printf("짝수 : %d\n", evenCount);
    System.out.printf("홀수 : %d\n", oddCount);

  }
}
