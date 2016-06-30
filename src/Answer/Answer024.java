package Answer;
/*
홍길동 [90점]: *********
임꺽정 [80점]: ********
유관순 [90점]: *********
이순신 [100점]: **********
*/

public class Answer024 {

  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "이순신"};
    int[] scores = {90, 80, 90, 100};

    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s [%d점]: ", names[i], scores[i]);
      for (int j = 0; j < scores[i] / 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
