package answer;
/*
  1  2  3  4  5
 10  9  8  7  6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
----90도 돌리기----
 21 20 11 10  1
 22 19 12  9  2
 23 18 13  8  3
 24 17 14  7  4
 25 16 15  6  5

*/



public class Answer048 {
  
  final static int MAX = 5;
  public static void main(String[] args) {
    
    int[][] numbers = new int[MAX][MAX];
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        numbers[i][j] = i % 2 == 0 ? (i * MAX) + j + 1 : (i * MAX + 5) - j;
      }
    }
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        System.out.printf("%3d", numbers[i][j]);
      }
      System.out.println();
    }
    
    System.out.println("----90도 돌리기----");
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        System.out.printf("%3d", numbers[MAX - 1 - j][i]);
      }
      System.out.println();
    }
  }
}
