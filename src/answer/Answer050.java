package answer;

import java.util.Scanner;

public class Answer050 {

  public static void main(String[] args) {
    
 Scanner keyScan = new Scanner(System.in);
    
    System.out.print("문장을 입력 하세요. ");
    String str = keyScan.nextLine();
    
    int words = 0;
    boolean charFlag = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (charFlag) {
          words++;
          charFlag = false;
        }
        continue;
      }
      charFlag = true;
    }
    
    if(charFlag) {
      words++;
    }
    
    System.out.printf("단어 개수: %d\n", words);
    
    keyScan.close();
  }

}
