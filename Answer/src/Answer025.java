

public class Answer025 {

  public static void main(String[] args) {


    int inputNum = Integer.parseInt(args[0]);

    if (inputNum % 2 == 0) {
      inputNum++;
    }

    int spaceCount = 0;

    for (int i = 0; i < inputNum; i+= 2) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.printf(" ");
      }
      spaceCount++;

      for (int k = inputNum; k > i; k--) {
        System.out.printf("*");
      }
      System.out.println();
    }

  }
}
