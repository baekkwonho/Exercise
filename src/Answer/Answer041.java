package Answer;
/*
숫자를 입력 하세요: 5
0
1
2
3
4
5
*/

import java.util.Scanner;

public class Answer041 {

  public static void main(String[] args) {

    Scanner keyScanner = new Scanner(System.in);

    System.out.print("숫자를 입력 하세요: ");
    int num = Integer.parseInt(keyScanner.nextLine());

    int i = 0;

    while ( i <= num){
      System.out.println(i);
      i++;
    }


  }
}
