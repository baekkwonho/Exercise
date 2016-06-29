package Answer;
/*
합계 : 1054
마지막으로 더한 값 : 55
*/

public class Answer017 {

  public static void main(String[] args){

    int num = 1, sum = 0;

    while (true) {

      if (num % 2 != 0)
        sum += num;

      else if (num % 3 == 0 && num % 2 == 0)
        sum += num;
        
      if ( sum > 1000) {
        System.out.println("합계 : " + sum);
        System.out.println("마지막으로 더한 값 : " + num);
        break;
      }
      num ++;
    }

  }
}
