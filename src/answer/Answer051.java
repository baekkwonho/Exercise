package answer;
/*
양의 정수를 입력 하세요. 28
C
*/
import java.util.Scanner;

public class Answer051 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("양의 정수를 입력 하세요. ");
    int num = Math.abs(Integer.parseInt(keyScan.nextLine()));
    
    char c = (char)('A' + (num % 26));
    System.out.println(c);
    
    keyScan.close();
    
  }
}
