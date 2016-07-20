package answer;
/*
출력할 구구단은?(0은 종료) :  3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27

출력할 구구단은?(0은 종료) :  0
*/

public class Answer039 {

  public static void main(String[] args) {


    java.util.Scanner keyScanner = new java.util.Scanner(System.in);

    while (true) {
    System.out.print("출력할 구구단은?(0은 종료) :  ");
    int number = Integer.parseInt(keyScanner.nextLine());

    if (number >= 2 && number <= 9) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", number, j, number * j);
      }
      System.out.println();
    } else if (number == 0) {
      break;
    } else {
      continue;
      }
    }

  }
}
