package Answer;
/*
길이를 입력 해 주세요. 8
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;

public class Answer025 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("길이를 입력 해 주세요. ");
    int length = Integer.parseInt(keyScanner.nextLine());

    if (length % 2 == 0) {
      length++;
    }

    int spaceCount = 0;

    for (int i = 0; i < length; i+= 2) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.printf(" ");
      }
      spaceCount++;

      for (int k = length; k > i; k--) {
        System.out.printf("*");
      }
      System.out.println();
    }

    keyScanner.close();
    
  }
}
