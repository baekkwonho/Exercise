
public class Practice {

  public static void main(String[] args) {
    
    int i = 2, j = 1, k = 1;
    
    while (i <= 18) {
      if (i % 2 == 0) {
        j = 2;
      }else {
        j = 1;
      }
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j += 2;
      }
      System.out.println();
      i += k;
      k++;
    }
  }
}
