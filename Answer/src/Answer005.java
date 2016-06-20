
public class Answer005 {

  public static void main(String[] args) {

    int number = Integer.parseInt(args[0]);

    int randnum = (int)(Math.random() * 10);
    int count = 0;

    while (number > 0) {
      if (number % 10 == randnum) {
        count++;
      }
      number /= 10;
    }

    System.out.printf("난수 : %d \n", randnum);
    System.out.printf("개수 : %d \n", count);

  }
}
