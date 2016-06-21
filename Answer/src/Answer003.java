
public class Answer003 {

  public static void main(String[] args) {

    int[] numbers  = new int[args.length];

    int max = Integer.parseInt(args[0]);
    int min = Integer.parseInt(args[0]);

    for (int i = 0; i < args.length; i++) {
      numbers[i] = Integer.parseInt(args[i]);
    }

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }

    System.out.printf("가장 큰 수 : %d\n", max);
    System.out.printf("가장 작은 수 : %d\n", min);


  }
}
