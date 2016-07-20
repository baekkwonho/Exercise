package answer;
/*
길이를 입력 하세요. 7
*
**
***
****
***
**
*
*/

import java.util.Scanner;

public class Answer026 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("길이를 입력 하세요. ");
    int inputNum = Integer.parseInt(keyScanner.nextLine());

  if (inputNum % 2 == 0) {
    inputNum++;
  }

  int endLen = 1;

  for (int i = 0; i < inputNum; i++) {
    for (int j = 0; j < endLen; j++) {
      System.out.printf("*");
    }
    System.out.println();
    if (i < inputNum / 2) {
      endLen++;
    }else {
      endLen--;
    }
  }

  keyScanner.close();

  }
}
