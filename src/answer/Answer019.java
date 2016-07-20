package answer;
/*
0 - 0
1 - 3
2 - 6
3 - 9
4 - 12
5 - 15
6 - 18
7 - 21
8 - 24
9 - 27
10 - 30
*/

public class Answer019 {

  public static void main(String[] args) {

    for (int i = 0, j = 0; i <= 10; i++, j+= 3) {
      System.out.printf("%d - %d\n", i, j);
    }

  }
}
