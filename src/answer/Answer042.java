package answer;
/*
2 * 2 = 4 
2 * 4 = 8 
2 * 6 = 12 
2 * 8 = 16 

3 * 1 = 3 
3 * 3 = 9 
3 * 5 = 15 
3 * 7 = 21 
3 * 9 = 27 

5 * 1 = 5 
5 * 3 = 15 
5 * 5 = 25 
5 * 7 = 35 
5 * 9 = 45 

8 * 2 = 16 
8 * 4 = 32 
8 * 6 = 48 
8 * 8 = 64 

12 * 2 = 24 
12 * 4 = 48 
12 * 6 = 72 
12 * 8 = 96 

17 * 1 = 17 
17 * 3 = 51 
17 * 5 = 85 
17 * 7 = 119 
17 * 9 = 153 
*/

public class Answer042 {

  public static void main(String[] args) {

    int i = 2, j, k = 1;

    while (i <= 18) {
      if ( i % 2 == 0) {
        j = 2;
      } else {
        j = 1;
      }
      while (j <= 9) {
        System.out.printf("%d * %d = %d \n", i, j, i * j);
        j += 2;
      }
      i += k;
      k++;
      System.out.println();
    }
  }
}
