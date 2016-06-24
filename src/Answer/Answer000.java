package Answer;

public class Answer000 {

  public static void main(String[] args) {

    for (int i = 0; i <= 9; i++) {
      System.out.printf("%d", i);
      if (i % 2 == 0) {
        System.out.print("(짝수)\n");
      } else {
        System.out.print("(홀수)\n");
      }
    }
  }
}
