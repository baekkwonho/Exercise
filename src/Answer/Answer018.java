package Answer;
/*
4
5
6
7
8
9
21
22
23
24
25
26
27
28
29
30
*/
public class Answer018 {

  public static void main(String[] args) {

    for (int i = 4; i <= 30; i++) {
      if ( i >= 10 && i <= 20) {
        continue;
      }
      System.out.println(i);
    }
    

  }
}
