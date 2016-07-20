package answer;
/*
삼각형의 밑변의 길이를 입력 하세요. 6
직각삼각형
*
**
***
****
*****
******
역삼각형
******
*****
****
***
**
*

*/

import java.util.Scanner;

public class Answer006 {

  public static void main(String[] args) {

    Scanner keyScanner = new Scanner(System.in);

    System.out.print("삼각형의 밑변의 길이를 입력 하세요. ");
    int len = Integer.parseInt(keyScanner.nextLine());

    System.out.println("직각삼각형");
    for (int i = 0; i < len; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("역삼각형");
    for (int i = 0; i < len; i++) {
      for (int j = len; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    keyScanner.close();


  }
}
