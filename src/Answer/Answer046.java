package Answer;
/*
1  2  3  4  5
10  9  8  7  6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
-----좌우 대칭-----
5  4  3  2  1
6  7  8  9 10
15 14 13 12 11
16 17 18 19 20
25 24 23 22 21
*/



public class Answer046 {
  
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
    
    System.out.println("-----좌우 대칭-----");
    
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        System.out.printf("%3d", numbers[i][MAX-j-1]);
      }
      System.out.println();
    }
  }
}
