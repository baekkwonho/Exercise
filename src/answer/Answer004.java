package answer;
/*
숫자를 입력 하세요. 1566874
가장 큰 수: 8
가장 작은 수: 1
*/

import java.util.Scanner;

public class Answer004 {
  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 하세요. ");
    int number = Integer.parseInt(keyScanner.nextLine());
    int max = number % 10;
    int min = number % 10;

    while (number > 0) {
      if (number % 10 > max) {
        max = number % 10;
      } else if (number % 10 < min) {
        min = number % 10;
      }
      number /= 10;
    }

    System.out.printf("가장 큰 수: %d\n", max);
    System.out.printf("가장 작은 수: %d\n", min);
    
    keyScanner.close();

  }
}
