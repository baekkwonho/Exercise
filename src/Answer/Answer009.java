package Answer;
/*
row? : 3
col? : 3
[0][0] input number: 1
[0][1] input number: 9
[0][2] input number: 8

[1][0] input number: 2
[1][1] input number: 4
[1][2] input number: 2

[2][0] input number: 4
[2][1] input number: 5
[2][2] input number: 7

1 9 8 
2 4 2 
4 5 7 
*/
import java.util.Scanner;

public class Answer009 {

  public static void main(String[] args) {

    Scanner keyScanner = new Scanner(System.in);

    System.out.print("row? : ");
    int row = Integer.parseInt(keyScanner.nextLine());
    System.out.print("col? : ");
    int col = Integer.parseInt(keyScanner.nextLine());

    int[][] num = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.printf("[%d][%d] input number: ", i, j);
        num[i][j] = Integer.parseInt(keyScanner.nextLine());
      }
      System.out.println();
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.printf("%d ", num[i][j]);
      }
      System.out.println();
    }

  }
}
