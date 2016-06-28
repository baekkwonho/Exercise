package Answer;

/*
숫자를 입력 하세요. 1566874
난수 : 4 
개수 : 1 
*/

import java.util.Scanner;

public class Answer005 {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("숫자를 입력 하세요. ");
    int number = Integer.parseInt(keyScanner.nextLine());
    int randnum = (int)(Math.random() * 10);
    int count = 0;
    while (number > 0) {
      if (number % 10 == randnum) {
        count++;
      }
      number /= 10;
    }
    System.out.printf("난수 : %d \n", randnum);
    System.out.printf("개수 : %d \n", count);

    keyScanner.close();
  }
}
