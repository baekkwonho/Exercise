

public class Answer021 {

  public static void main(String[] args) {

    int[] numbers = new int[20];
    int randnum, temp;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }

    for (int i = 0; i < numbers.length; i++) {
      randnum = (int)(Math.random() * 20);
      temp = numbers[i];
      numbers[i] = numbers[randnum];
      numbers[randnum] = temp;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ", numbers[i]);
    }

    System.out.println();

  }
}
