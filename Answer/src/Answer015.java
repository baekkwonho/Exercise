
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
    System.out.printf("결과: %d/%d\n", numerator[maxindex], denominator[maxindex]);

  }
}
