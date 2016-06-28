package Answer;
/*
국어   영어   수학    총점   평균
60.50  78.90  95.00  234.40  78.13  
90.00  85.00  99.00  274.00  91.33  
80.00  74.00  98.00  252.00  84.00  
70.00  82.00  97.00  249.00  83.00  
60.00  88.00  96.00  244.00  81.33  
*/


public class Answer008 {

  public static void main(String[] args) {

    double[][] scores = {
      {60.5, 78.9, 95, 0, 0},
      {90, 85, 99, 0, 0},
      {80, 74, 98, 0, 0},
      {70, 82, 97, 0, 0},
      {60, 88, 96, 0, 0}
    };
    
    System.out.println("국어   영어   수학    총점   평균");
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < 3; j++){
      scores[i][3] += scores[i][j];
      }
      scores[i][4] = scores[i][3] / 3;
    }

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores.length; j++) {
        System.out.printf("%.2f  ", scores[i][j]);
      }
      System.out.println();
    }

  }
}
