package Answer;
/*
밑변의 길이를 입력 하세요. 6
*
***
*****
*******
*/
import java.util.Scanner;

public class Answer007 {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("밑변의 길이를 입력 하세요. ");
    int length = Integer.parseInt(keyScanner.nextLine());
    
    if (length % 2 == 0)
      length++;
    int spaceCount = length / 2;
    
    for (int i = 0; i < length; i += 2) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.print(" ");
      }
      spaceCount--;
      for (int k = 0; k <= i; k ++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    keyScanner.close();
  }

}
