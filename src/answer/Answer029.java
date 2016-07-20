package answer;
/*
0
1
3
4
6
7
9
10
12
13
15
16
18
19
*/

public class Answer029 {

  public static void main(String[] args) {
    System.out.println("=======1번째 방법========");
    for (int i =0, x = 2; i <=20; i += x) {
      System.out.println(i);
      if ( x == 2) {
        x = 1;
      } else {
        x = 2;
      }
    }

    System.out.println("=======2번째 방법========");
    for (int i = 0, x = 1; i <= 20; i += x, x = 3 - x) {
      System.out.println(i);
    }


  }
}
