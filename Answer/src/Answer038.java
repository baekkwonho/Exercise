

public class Answer038 {

  public static void main(String[] args) {

    java.util.Scanner keyScanner = new java.util.Scanner(System.in);

    System.out.print("출력할 구구단은? ");
    String number = keyScanner.nextLine();


    for (int j = 1; j <= 9; j++) {
      System.out.printf("%d * %d = %d\n", Integer.parseInt(number), j, Integer.parseInt(number) * j);
    }
    System.out.println();


  }
}
