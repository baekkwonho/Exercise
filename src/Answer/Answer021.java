package Answer;
/*
numbers: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
mix numbers: 10 17 14 4 18 6 16 3 7 11 13 8 2 0 5 19 9 12 15 1 
*/


public class Answer021 {

  public static void main(String[] args) {

    int[] numbers = new int[20];
    int randnum, temp;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }
    
    System.out.print("numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println();

    for (int i = 0; i < numbers.length; i++) {
      randnum = (int)(Math.random() * 20);
      temp = numbers[i];
      numbers[i] = numbers[randnum];
      numbers[randnum] = temp;
    }
    
    System.out.print("mix numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ", numbers[i]);
    }

    System.out.println();

  }
}
