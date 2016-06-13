


public class Exercise01 {

  static void exam() {

    int randnum;

    randnum = (int)(Math.random() * 10);

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
        System.out.println(" {1, 2, 4, 7, 11, 9} \n 합계: 15 \n ");
        break;
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
