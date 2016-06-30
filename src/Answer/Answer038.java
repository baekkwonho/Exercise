package Answer;
/*
출력할 구구단은? 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
*/


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
