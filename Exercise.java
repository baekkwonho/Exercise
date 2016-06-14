


public class Exercise {

  static void exam() {

    int randnum;

    randnum = (int)(Math.random() * 27);

    switch (randnum) {
      case 0 :
        System.out.println(" 0번\n 0~9까지 숫자를 출력\n 각 숫자가 홀수인지 짝수인지 출력한다.");
        System.out.println("0(짝수) 1(홀수) 2(짝수) ....");
        break;
      case 1 :
        System.out.println(" 1번\n 숫자를 입력받아서 홀수 개수와 짝수 개수를 센다.");
        System.out.println(" >java Exercise 1 5 6 6 8 7 4 \n 짝수: 4 \n 홀수: 3 ");
        break;
      case 2 :
        System.out.println(" 2번 \n 숫자를 입력받아서 그 숫자에 포함된 홀수와 짝수를 센다.");
        System.out.println(" >java Exercise 1566874 \n 짝수:4 \n 홀수: 3 ");
        break;
      case 3 :
        System.out.println(" 3번 \n 숫자를 입력 받아서 그 중 가장 큰 수와 가장 작은 수를 찾아라!");
        System.out.println(" > java Exercise 278 34 12 1980 22 6 \n 가장 큰 수: 1980 \n 가장 작은 수: 6");

        break;
      case 4 :
        System.out.println(" 4번 \n 숫자를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!");
        System.out.println(" > java Exercise 1566874 \n 가장 큰 수: 8 \n 가장 작은 수: 1");
        break;
      case 5 :
        System.out.println(" 5번 \n 숫자를 입력받아서 컴퓨터에서 생성한 난수를 몇 개 포함하고 있는 지 세어라");
        System.out.println(" > java Exercise 1566874 \n 난수 : 6 \n  개수: 2");

        break;
      case 6 :
        System.out.println(" 6번 \n 밑변의 길이를 숫자를 입력 받아 직각 삼각형과 직각역삼각형을 출력하라.");
        System.out.println(" > java Exercise 6 \n ");

        break;
      case 7 :
        System.out.println(" 7번\n 밑변의 길이를 숫자로 입력 받아 트리를 출력하라.\n 짝수 길이를 입력 받았으면 +1 하여 홀수 만들어 출력한다.");

        break;
      case 8 :
        System.out.println(" 8번 \n 다섯 명의 국영수 점수를 계산하여 총점과 평균을 구하라\n 각 학생의 총점과 평균은 배열에 저장하라.\n{60.5, 78.9, 95, 0, 0},\n{90, 85, 99, 0, 0},\n{80, 74, 98, 0, 0},\n{70, 82, 97, 0, 0},\n{60, 88, 96, 0, 0}\n");
        break;
      case 9 :
        System.out.println(" 9번 \n 배열에서 이웃 값과의 차이(절대값)를 모두 더하여 출력하라!");
        System.out.println(" {1, 2, 4, 7, 11, 9} \n 합계: 12 \n ");
        break;

      case 10 :
        System.out.println(" 10번 \n 배열에서 이웃 값과의 차이(절대값)를 모두 더하여 출력하라!");
        System.out.println(" {1, 2, 4, 7, 11, 9}\n 합계: 12");
        break;


      case 11 :
        System.out.println(" 11번 \n 두 개의 배열이 있다. 한 배열의 값을 다른 배열로 복사하라!");
        System.out.println(" list1: 1, 2, 4, 7, 11, 9 \n list2: 1, 2, 4, 7, 11, 9 ");
        break;

      case 12 :
        System.out.println(" 12번 \n 두 개의 배열이 있다. 한 배열의 값을 다른 배열로 역순으로 복사하라!");
        System.out.println(" list1: 1, 2, 4, 7, 11, 9 \n list2: 9, 11, 7, 4, 2, 1");
        break;

      case 13 :
        System.out.println(" 13번 \n 배열을 반으로 나눠서 서로 값을 바꾼다.  단 배열의 항목은 항상 짝수여야 한다.");
        System.out.println(" list1: 1, 2, 4, 7, 11, 9, 30, 3 \n Change list1: 11, 9, 30, 3, 1, 2, 4, 7");
        break;

      case 14 :
        System.out.println(" 14번 \n 배열이 등비수열인지 여부를 확인한다.");
        System.out.println(" {1, 4, 16, 64, 254} : 등비수열이다. \n {1, 4, 16, 32, 128} : 등비수열이 아니다.");
        break;

      case 15 :
        System.out.println(" 15번 \n 분모, 분자 두 개의 배열이 있다. 나눈 계산 결과 중에서 가장 큰 수를 출력하라!");
        System.out.println(" 분자 {5, 2, 5}\n 분모 {6, 3, 4} \n 결과: 5/4");
        break;

      case 16 :
        System.out.println(" 16번 \n 주어진 문자열의 알파벳의 개수를 센다.");
        System.out.println(" >java Exercise circleofnumbers \n b:1 c:2 e:2 ...");
        break;

      case 17 :
        System.out.println(" 17번 \n 반복문을 사용하여 4에서 30까지 1씩 증가한 값을 출력한다.\n 단 10~20 사이는 출력하지 말아라.");
        break;

      case 18 :
        System.out.println(" 18번 \n 반복문을 사용하여 4에서 30까지 1씩 증가한 값을 출력한다.\n 단 10~20 사이는 출력하지 말아라.");
        break;

      case 19 :
        System.out.println(" 19번 \n 반복문을 사용하여 0에서 10까지 1씩 증가한 값을 출력한다.\n 동시에 0부터 3씩 증가한 값을 출력한다.");
        System.out.println(" 0 - 0\n 1 - 3\n 2 - 6");
        break;

      case 20 :
        System.out.println(" 20번 \n 구구단 2~9단까지 출력하라!");
        break;

      case 21 :
        System.out.println(" 21번 \n 0에서 19까지 정수가 저장된 배열의 수를 임의로 섞어라.");
        break;

      case 22 :
        System.out.println(" 22번 \n 정수 배열에 0부터 19까지의 수가 섞여 저장되어 있다.");
        System.out.println(" 숫자를 0부터 19까지 오름차순(ascending)으로 정렬하라!");
        break;

      case 23 :
        System.out.println(" 23번 \n 입력 값으로 문자열과 문자를 받아서, 문자열에 해당 문자가 몇 개있는 지 세어라!");
        System.out.println(" >java Exercise computerscience c \n c: 3개 or 일치하는 문자가 없습니다.");
        break;

      case 24 :
        System.out.println(" 24번 \n 학생의 평균 점수를 담은 정수 배열이 있다.\n 점수에 해당하는 만큼 10당 한 개의 * 문자를 출력하라.");
        System.out.println(" 홍길동: *********\n 임꺽정: ********\n 유관순: *********\n 이순신: **********");
        break;

      case 25 :
        System.out.println(" 25번 \n 길이를 입력 받아 역삼각형을 출력하라.\n 단, 입력받은 값이 짝수면 홀수로 바꾼다.");

      case 26 :
        System.out.println(" 26번 \n 길이를 입력 받아 삼각형을 출력하라\n >java Exercise 8");
        System.out.println(" *\n **\n ***\n ****\n *****\n ****\n ***\n **\n *\n");

    }
  }

  static void answer(int a) {

    switch (a) {
      case 0 :
        System.out.println("000");
        break;
      case 1 :
        System.out.println("111");
        break;
      case 2 :
        System.out.println("222");
        break;
      case 3 :
        System.out.println("333");
        break;
      case 4 :
        System.out.println("444");
        break;
      case 5 :
        System.out.println("555");
        break;
      case 6 :
        System.out.println("666");
        break;
      case 7 :
        System.out.println("777");
        break;
      case 8 :
        System.out.println("888");
        break;
      case 9 :
        System.out.println("999");
        break;
    }
  }

}