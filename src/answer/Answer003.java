package answer;
/*
숫자를 5개 입력 하세요. 
[0]번째 숫자 278
[1]번째 숫자 34
[2]번째 숫자 12
[3]번째 숫자 1980
[4]번째 숫자 524
가장 큰 수 : 1980
가장 작은 수 : 12
*/

import java.util.Scanner;

public class Answer003 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.println("숫자를 5개 입력 하세요. ");
   for (int i = 0; i < 5; i++ ) {
     System.out.printf("[%d]번째 숫자 ", i);
     numbers[i] = keyScanner.nextInt();
   }

    int max = numbers[0];
    int min = numbers[0];

    for (int i = 0; i < args.length; i++) {
      numbers[i] = Integer.parseInt(args[i]);
    }

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }

    System.out.printf("가장 큰 수 : %d\n", max);
    System.out.printf("가장 작은 수 : %d\n", min);
    
    keyScanner.close();

  }
}
