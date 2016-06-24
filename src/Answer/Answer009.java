package Answer;

import java.util.Scanner;

public class Answer009 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("row? : ");
    int row = Integer.parseInt(sc.nextLine());
    System.out.print("col? : ");
    int col = Integer.parseInt(sc.nextLine());

    int[][] num = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.printf("[%d][%d] input number: ", i, j);
        num[i][j] = Integer.parseInt(sc.nextLine());
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
