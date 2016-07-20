package answer;
/*
숫자를 입력 하세요. 1566874
짝수 : 4
홀수 : 3
*/


import java.util.Scanner;

public class Answer002 {

  public static void main(String[] args) {
    
    System.out.print("숫자를 입력 하세요. ");
    Scanner keyScanner = new Scanner(System.in);

    int number = keyScanner.nextInt();
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
    
    
    keyScanner.close();

  }
}
