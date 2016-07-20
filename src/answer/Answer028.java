package answer;
/*
숫자를 입력 해주세요. 11125
합계 : 10
*/

import java.util.Scanner;

public class Answer028 {
  
  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 해주세요. ");
    int num = Integer.parseInt(keyScanner.nextLine());
    int sum = 0;
    
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("합계 : " + sum);
    
    keyScanner.close();
    
  }
}
