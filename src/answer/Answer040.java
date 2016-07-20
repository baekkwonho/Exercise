package answer;
/*
수를 입력 하세요(음수는 종료) : 5
홀수 입니다.
수를 입력 하세요(음수는 종료) : 4
짝수 입니다.
수를 입력 하세요(음수는 종료) : -1
*/
import java.util.Scanner;

public class Answer040 {

  public static void main(String[] args) {

    Scanner keyScanner = new Scanner(System.in);

    while (true) {

      System.out.print("수를 입력 하세요(음수는 종료) : ");
      int num = Integer.parseInt(keyScanner.nextLine());

      if (num < 0)
        break;
      else if (num % 2 ==0)
        System.out.println("짝수 입니다.");
      else
        System.out.println("홀수 입니다.");
    }
    
  }
}
