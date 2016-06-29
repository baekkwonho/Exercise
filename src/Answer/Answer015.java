package Answer;
/*
{5 ,2 ,5}
{6 ,3 ,4}
결과: 5/4

*/
public class Answer015 {

  public static void main(String[] args) {

    int[] numerator = {5, 2, 5};
    int[] denominator = {6, 3, 4};

    int maxindex = 0;
    
    for (int i = 1; i < numerator.length; i++) {
      if (numerator[maxindex] * denominator[i] < denominator[maxindex] * numerator[i]) {
        maxindex = i;
      }
    }
    
    System.out.print("{");
    for(int i = 0; i < numerator.length; i++) {
      if ( i == 0) {
        System.out.printf("%d", numerator[i]);
      } else {
      System.out.printf(" ,%d" , numerator[i]);
      }
    }
    System.out.println("}");
    
    System.out.print("{");
    for(int i = 0; i < denominator.length; i++) {
      if ( i == 0) {
        System.out.printf("%d", denominator[i]);
      } else {
      System.out.printf(" ,%d" , denominator[i]);
      }
    }
    System.out.println("}");
    
    System.out.printf("결과: %d/%d\n", numerator[maxindex], denominator[maxindex]);

  }
}
