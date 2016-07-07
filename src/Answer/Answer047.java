package Answer;

/*
숫자를 입력 하세요. 15231312
21313251
*/

import java.util.Scanner;

public class Answer047 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 하세요. ");
    int value1 = Integer.parseInt(keyScanner.nextLine());
    int value2 = 0;
    
    while (value1 > 0) {
      value2 *= 10;
      value2 += value1 % 10;
      value1 /= 10;
    }
    System.out.println(value2);
    
    keyScanner.close();
  }
}
