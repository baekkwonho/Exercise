package Answer;
/*
0
1
3
6
10
15
*/
public class Answer031 {

  public static void main(String[] args) {

    for (int i = 0, j = 1; i <= 20; i += j, j++) {
      System.out.println(i);
    }
  }
}
