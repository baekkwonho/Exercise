package Answer;
/*
0(짝수)
1(홀수)
2(짝수)
3(홀수)
4(짝수)
5(홀수)
6(짝수)
7(홀수)
8(짝수)
9(홀수)
*/

public class Answer000 {

  public static void main(String[] args) {

    for (int i = 0; i <= 9; i++) {
      System.out.printf("%d", i);
      if (i % 2 == 0) {
        System.out.print("(짝수)\n");
      } else {
        System.out.print("(홀수)\n");
      } //
    }
  }
}
