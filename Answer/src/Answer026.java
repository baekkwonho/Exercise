

public class Answer026 {

  public static void main(String[] args) {


//  첫번째 방법


    int inputNum = Integer.parseInt(args[0]);

    if (inputNum % 2 == 0) {
      inputNum++;
    }

    int spaceCount = inputNum / 2;

    for (int i = 0; i < inputNum; i+= 2) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.printf(" ");
      }
      spaceCount--;

      for (int k = 0; k <= i; k++) {
        System.out.printf("*");
      }
      System.out.println();
    }


// 2번째 방법
/*

  int inputNum = Integer.parseInt(args[0]);

  if (inputNum % 2 == 0) {
    inputNum++;
  }

  int endLen = 1;

  for (int i = 0; i < inputNum; i++) {
    for (int j = 0; j < endLen; j++) {
      System.out.printf("*");
    }
    System.out.println();
    if (i < inputNum / 2) {
      endLen++;
    }else {
      endLen--;
    }
  }

*/

  }
}
