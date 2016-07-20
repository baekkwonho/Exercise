package answer;
/*
문자열을 입력 하세요. computerscience
문자를 입력 하세요. c
c : 3개
*/

import java.util.Scanner;

public class Answer023 {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    int count = 0;
    
    System.out.print("문자열을 입력 하세요. ");
    String str = keyScanner.nextLine().toLowerCase();
    char[] chars = str.toCharArray();
    System.out.print("문자를 입력 하세요. ");
    char ch = keyScanner.nextLine().toLowerCase().charAt(0);
    
    for (int i = 0; i < chars.length; i++) {
      if ( chars[i] == ch) {
        count++;
      }
    }
    
    if ( count > 0) {
      System.out.printf("%c : %d개\n", ch, count);
    } else {
      System.out.println("일치하는 문자가 없습니다.");
    }
    
    keyScanner.close();
  }
}
