package Answer;

/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 */

public class Answer043 {
  
  final static int MAX = 5;

  public static void main(String[] args) {
    
    int[][] numbers = new int[MAX][MAX];
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        numbers[i][j] = (i * MAX) + (j + 1);
      }
    }
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        System.out.printf("%3d ", numbers[i][j]);
      }
      System.out.println();
    }
  }

}
