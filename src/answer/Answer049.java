package answer;
/*
1  3  6 10 15
2  5  9 14 19
4  8 13 18 22
7 12 17 21 24
11 16 20 23 25
*/

public class Answer049 {

  final static int MAX = 5;
    
  public static void main(String[] args) {
    
    int[][] numbers = new int[MAX][MAX];
    int k = 0;
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j <= i; j++) {
        numbers[i-j][j] = ++k;
      }
    }
    for (int i = 1; i < MAX; i++) {
      for (int j = i; j < MAX; j++) {
        numbers[MAX-1+i-j][j] = ++k;
      }
    }
   
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        System.out.printf("%3d", numbers[i][j]);
      }
      System.out.println();
    }
    
    
  }

}
