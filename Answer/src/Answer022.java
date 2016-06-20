

public class Answer022 {

  public static void main(String[] args) {

    int[] numbers = new int[20];
    int randomNum = 0, tmp;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }

    for (int i = 0; i < numbers.length; i++) {
      randomNum = (int)(Math.random() * 20);
      tmp = numbers[i];
      numbers[i] = numbers[randomNum];
      numbers[randomNum] = tmp;
    }

    System.out.print("정렬 전: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ",numbers[i]);
    }
    System.out.println();
    for (int i = 1; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length - i; j++) {
        if (numbers[j] > numbers[j+1]) {
          tmp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = tmp;
        }
      }
    }

    System.out.print("정렬 후: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ",numbers[i]);
    }
    System.out.println();

  }
}
