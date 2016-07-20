package game.baseball;

import java.util.Scanner;

public class BaseballMain {

  public static void main(String[] args) {
    
    int strike = 0, ball = 0, out = 0;
    int[] randNum = new int[3];
    int[] inputNum = new int[3];
    Scanner keyScan = new Scanner(System.in);
    int inputNo;
    int count = 1;
    
    label2 :
    for (int i = 0; i < randNum.length; i++) {
      if ( i == 0) {
      randNum[i]  = (int)(Math.random() * 10);
      continue;
      }
      for (int j = 0; j < randNum.length; j++) {
        if (i == j) 
          continue;
        else if (randNum[i] == randNum[j]) {
          i--;
          continue label2;
        }
      }
    }
    
    
    
    
   // 컴퓨터 번호
    for (int i = 0; i < randNum.length; i++) {
      System.out.printf("%d", randNum[i]);
    }
    System.out.println();
    
    
    label1 :
    while (true) {
      System.out.printf("%d번째 - 숫자를 입력 하세요. ", count);
      String tmpNum = keyScan.nextLine();
      
      if (tmpNum.length() > 3) {
        continue label1;
      }
      
      inputNo = Integer.parseInt(tmpNum);
      
      strike = 0;
      ball = 0;
      
      for (int i = 2; i >= 0; i--) {
        inputNum[i] = inputNo % 10;
        inputNo /= 10;
      }
      
      // strike check
      for (int i = 0; i < randNum.length; i++) {
        if (randNum[i] == inputNum[i]) {
          strike++;
        } 
        if (strike == 3) {
          System.out.printf("3Strike입니다.\n[%d]번째 성공\n", count);
          break label1;
        }
      }
      
      // ball check
      for (int i = 0; i < inputNum.length; i++) {
        for (int j = 0; j < randNum.length; j++) {
          if (j == i)
            continue;
          else if (randNum[j] == inputNum[i])
            ball++;
        }
      }
      
      // out check
      if (strike < 1 && ball < 1) {
        out++;
      }
      
      if (out == 3) {
        System.out.println("3Out 입니다.");
        break label1;
      }
      
      System.out.printf("%d Strike %d ball 입니다.\n", strike, ball);
      
      count++;
    }
        
    keyScan.close();
  }
  
  

}
