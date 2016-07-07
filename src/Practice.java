
public class Practice {
  
  public static void main(String[] args) {
    
    int stage = 2;
    
    while (stage < 9) {
      int i = 1;
      if (stage % 3 == 0) {
        stage++;
      }
      while (i <= 9) {
        System.out.printf("%d * %d = %d\n", stage, i, stage * i);
        i++;
      }
      System.out.println();
      stage++;
      
    }
     
  }
}
