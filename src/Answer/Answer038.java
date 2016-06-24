package Answer;


public class Answer038 {

  public static void main(String[] args) {

    java.util.Scanner keyScanner = new java.util.Scanner(System.in);

    System.out.print("출력할 구구단은? ");
    int number = Integer.parseInt(keyScanner.nextLine());


    for (int j = 1; j <= 9; j++) {
      System.out.printf("%d * %d = %d\n", number, j, number * j);
    }
    System.out.println();


  }
}
