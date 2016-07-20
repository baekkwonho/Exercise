package answer;
/*
숫자를 입력 하세요. 2745339
2 - 1
3 - 2
4 - 1
5 - 1
7 - 1
9 - 1
*/
import java.util.Scanner;

public class Answer045 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 하세요. ");
    int number = Integer.parseInt(keyScanner.nextLine());
    int[] numberCount = new int[10];
    
    for (int i = 0; i < numberCount.length; i++) {
      numberCount[i] = 0;
    }
    
    while (number > 0) {
      numberCount[number % 10] ++;
      number /= 10;
    }
    
    for (int i = 0; i < numberCount.length; i++) {
      if (numberCount[i] > 0) {
        System.out.printf("%d - %d\n", i, numberCount[i]);
      }
    }
    keyScanner.close(); 
  }
}
