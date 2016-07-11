import java.util.Scanner;

public class Practice {
  
  public static void main(String[] args) {
    
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이를 입력 하세요. ");
    int length = Integer.parseInt(keyScan.nextLine());
    
    if (length % 2 == 0)
      length++;
    
    int space = length / 2;
    
    for (int i = 0; i < length; i += 2){
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    keyScan.close();
  }
}
