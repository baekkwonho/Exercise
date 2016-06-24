package Answer;

public class Answer008 {

  public static void main(String[] args) {

    double[][] scores = {
      {60.5, 78.9, 95, 0, 0},
      {90, 85, 99, 0, 0},
      {80, 74, 98, 0, 0},
      {70, 82, 97, 0, 0},
      {60, 88, 96, 0, 0}
    };

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < 3; j++){
      scores[i][3] += scores[i][j];
      }
      scores[i][4] = scores[i][3] / 3;
    }

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores.length; j++) {
        System.out.printf("%f  ", scores[i][j]);
      }
      System.out.println();
    }

  }
}
