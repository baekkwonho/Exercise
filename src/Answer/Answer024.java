package Answer;


public class Answer024 {

  public static void main(String[] args) {

    String[] names = {"홍길동", "임꺽정", "유관순", "이순신"};
    int[] scores = {90, 80, 90, 100};

    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s: ", names[i]);
      for (int j = 0; j < scores[i] / 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
