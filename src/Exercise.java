


public class Exercise {

  static void exam() {

    int randnum;

    randnum = (int)(Math.random() * 53);


    switch (randnum) {
      case 0 :
        System.out.println(" 0번\n 0~9까지 숫자를 출력\n 각 숫자가 홀수인지 짝수인지 출력한다.");
        System.out.println(" 0(짝수) 1(홀수) 2(짝수) ....");
        break;
      case 1 :
        System.out.println(" 1번\n {3, 6, 8, 4, 12, 1, 9, 7} 배열이 있다.");
        System.out.println(" while문과 버블소트를 이용하여 정렬 하세요.");
        System.out.println(" 1 3 4 6 7 8 9 12 ");
        break;
      case 2 :
        System.out.println(" 2번 \n 숫자를 입력받아서 그 숫자에 포함된 홀수와 짝수를 센다.");
        System.out.println(" > 숫자를 입력 하세요. 1566874 \n 짝수:4 \n 홀수: 3 ");
        break;
      case 3 :
        System.out.println(" 3번 \n 숫자를 5개 입력 받아서 그 중 가장 큰 수와 가장 작은 수를 찾아라!");
        System.out.println(" > 숫자를 5개 입력 하세요 \n [1]번째 숫자 278\n [2]번째 숫자34\n [3]번째 숫자12\n [4]번째 숫자 1980 \n [5]번째 숫자 524\n 가장 큰 수: 1980 \n 가장 작은 수: 12");

        break;
      case 4 :
        System.out.println(" 4번 \n 숫자를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!");
        System.out.println(" > 숫자를 입력 하세요.  1566874 \n 가장 큰 수: 8 \n 가장 작은 수: 1");
        break;
      case 5 :
        System.out.println(" 5번 \n 숫자를 입력받아서 컴퓨터에서 생성한 난수를 몇 개 포함하고 있는 지 세어라");
        System.out.println(" > 숫자를 입력 하세요. 1566874 \n 난수 : 6 \n  개수: 2");

        break;
      case 6 :
        System.out.println(" 6번 \n 밑변의 길이를 숫자를 입력 받아 직각 삼각형과 역삼각형을 출력하라.");
        System.out.println(" > 삼각형의 밑변의 길이를 입력 하세요. 6 \n ");

        break;
      case 7 :
        System.out.println(" 7번\n 밑변의 길이를 숫자로 입력 받아 트리를 출력하라.\n 짝수 길이를 입력 받았으면 +1 하여 홀수 만들어 출력한다.");

        break;
      case 8 :
        System.out.println(" 8번 \n 다섯 명의 국영수 점수를 계산하여 총점과 평균을 구하라\n 각 학생의 총점과 평균은 배열에 저장하라.\n{60.5, 78.9, 95, 0, 0},\n{90, 85, 99, 0, 0},\n{80, 74, 98, 0, 0},\n{70, 82, 97, 0, 0},\n{60, 88, 96, 0, 0}\n");
        break;
      case 9 :
        System.out.println(" 9번 \n 행,열 을 사용자로부터 입력 받고 그 크기만큼 값을 넣고 전체를 출력한다.");
        System.out.println(" row? : 3 \n col? : 3");
        System.out.println(" [0][0] input number : 1 \n [0][1] input number : 10 ....");
        System.out.println(" 1 10 4 \n 2 4 8 \n 4 2 1 ");
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
        System.out.println(" 16번 \n 주어진 문자열의 알파벳의 개수를 센다.\n 알파벳은 무조건 소문자로 변경한다.");
        System.out.println(" >java Exercise circleofnumbers \n b:1\n c:2\n e:2\n ...");
        break;

      case 17 :
        System.out.println(" 17번 \n 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다");
        System.out.println(" 그 합이 언제 몇을 더했을 때 1000이 넘는지, 1000을 넘어선 합계 값이 무엇인지 출력하라");
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
        break;

      case 26 :
        System.out.println(" 26번 \n 길이를 입력 받아 삼각형을 출력하라\n >java Exercise 8");
        System.out.println(" *\n **\n ***\n ****\n *****\n ****\n ***\n **\n *\n");
        break;

      case 27 :
        System.out.println(" 27번 \n 구구단을 출력하는데 2단,4단,6단,8단만 출력하라.");
        System.out.println(" 단, 2단은 2까지 4단은 4까지 6단은 6까지 8단은 8까지만 출력하라");
        break;

      case 28 :
        System.out.println(" 28번 \n 숫자를 입력받아서 그 수 들의 합을 구하라");
        System.out.println(" > 숫자를 입력 하세요. 11125\n 합계 : 10");
        break;

      case 29 :
        System.out.println(" 29번 \n 0~ 20까지 다음과 같이 출력 하라\n 0 1 3 4 6 7 9 10 12");
        break;

      case 30 :
        System.out.println(" 30번 \n 2단부터 8단까지 짝수 구구단을 출력하며 1~9까지 홀수를 곱한다");
        System.out.println(" 단 6단은 1~9까지 곱한다");
        break;

      case 31 :
        System.out.println(" 31번 \n 0~20까지 1,2,3,4씩 증가하여 출력한다.");
        System.out.println(" 출력: 0 1 3 6 10 15");
        break;

      case 32 :
        System.out.println(" 32번 \n 2단~9단 구구단 출력 한다.");
        System.out.println(" 짝수 단은 홀수를 곱하고, 홀수 단은 짝수를 곱한다");
        break;

      case 33 :
        System.out.println(" 33번 \n While문을 사용하여 구구단을 출력 한다");
        break;

      case 34 :
        System.out.println(" 34번 \n While문을 사용하여 0~9까지 출력 한다");
        break;

      case 35 :
        System.out.println(" 35번 \n While문을 사용하여 9~0까지 출력 한다");
        break;

      case 36 :
        System.out.println(" 36번 \n While문을 사용하여 구구단을 출력 한다");
        System.out.println(" 짝수 단 만 출력하고, 6단은 제외 한다");
        break;

      case 37 :
        System.out.println(" 37번 \n While문을 사용하여 구구단을 출력 한다");
        System.out.println(" 3,6,9 단은 제외하고 출력 한다.");
        break;

      case 38 :
        System.out.println(" 38번 \n 사용자로부터 구구단의 특정 단을 입력받아 구구단을 출력하라");
        break;

      case 39 :
        System.out.println(" 39번\n 사용자로부터 구구단을 특정 단을 입력 받아 출력하라");
        System.out.println(" 단, 2~9 사이의 단만 출력하고, 0단이면 종료하라.");
        break;

      case 40 :
        System.out.println(" 40번\n 수를 입력 받고 홀수이면 홀수, 짝수이면 짝수라고 출력한다.");
        System.out.println(" 단 음수이면 프로그램 종료한다");
        System.out.println(" 수를 입력하세요 : 47 \n 홀수입니다.");
        break;

      case 41 :
        System.out.println(" 41번\n 수를 입력 받아 0부터 입력받은 수까지 출력한다");
        break;

      case 42 :
        System.out.println(" 42번\n while문을 이용하여 구구단을 2단~18단까지 출력한다.");
        System.out.println(" 단수는 2, 3, 5, 8, 12, 17단 순으로 출력 한다\n 짝수 단은 짝수만 곱하고, 홀수단은 홀수만 곱한다.");
        break;
        
      case 43 :
        System.out.println(" 43번\n 5행 5열 배열에 다음과 같이 넣고 출력 한다.");
        System.out.println("   1   2   3   4   5\n   6   7   8   9  10\n  11  12  13  14  15\n  16  17  18  19  20\n  21  22  23  24  25\n");
        break;
        
      case 44 :
        System.out.println(" 44번\n 5행 5열 배열에 다음과 같이 넣고 출력 한다. ");
        System.out.println("   1   2   3   4   5\n  10   9   8   7   6\n  11  12  13  14  15\n  20  19  18  17  16\n  21  22  23  24  25\n");
        break;
        
      case 45 :
        System.out.println(" 45번 \n 숫자를 입력 받아 해당 숫자의 개수를 출력 한다. ");
        System.out.println(" 숫자를 입력 하세요. 2745339\n 2 - 1\n 3 - 2\n 4 - 1\n 5 - 1\n 7 - 1\n 9 - 1");
        break;
       
      case 46 :
        System.out.println(" 45번 \n 5행 5열 배열에 다음과 같이 넣고 출력 하고, 좌우 대칭 하여 다시 출력 한다. ");
        System.out.println("   1   2   3   4   5\n  10   9   8   7   6\n  11  12  13  14  15\n  20  19  18  17  16\n  21  22  23  24  25\n");
        System.out.println("-----좌우 대칭-----");
        System.out.println("   5   4   3   2   1\n   6   7   8   9  10\n  15  14  13  12  11\n  16  17  18  19  20\n  25  24  23  22  21\n");
        break;
        
      case 47 :
        System.out.println(" 47번 \n 숫자를 입력 받고 역순으로 출력 한다. ");
        System.out.println(" 숫자를 입력 하세요 15231312\n 21313251");
        break;
        
      case 48 :
        System.out.println(" 48번 \n 5행 5열 배열에 다음과 같이 넣고 출력 하고,\n 시계방향으로 90도 회전 하여 다시 출력 한다.\n");
        System.out.println("   1   2   3   4   5\n  10   9   8   7   6\n  11  12  13  14  15\n  20  19  18  17  16\n  21  22  23  24  25");
        System.out.println("----90도 돌리기----");
        System.out.println("  21  20  11  10   1\n  22  19  12   9   2\n  23  18  13   8   3\n  24  18  14   7   4\n  25  16  15   6   5\n");
        break;
        
      case 49 :
        System.out.println(" 49번 \n 5행 5열 배열에 다음과 같이 넣고 출력 한다.");
        System.out.println("   1   3   6  10  15\n   2   5   9  14  19\n   4   8  13  18  22\n   7  12  17  21  24\n  11  16  20  23  25");
        break;
        
      case 50 :
        System.out.println(" 50번 \n 문장을 입력 받아 단어의 갯수를 출력 한다.");
        break;
        
      case 51 :
        System.out.println(" 51번 \n 양의 정수를 입력 받아 그 순서에 있는 대문자 알파벳을 출력한다. ");
        System.out.println(" 26이상이 되면 로테이션으로 다시 A부터 출력 한다. 0 = A ");
        break;
      
      case 52 :
        System.out.println(" 52번 \n 다음 배열의 값을 quickSort()함수를 이용하여 출력하라.\n");
        System.out.println("정렬전: 3 44 38 5 47 15 36 26 27 2 46 4 19 50 48 ");
        System.out.println("정렬후: 2 3 4 5 15 19 26 27 36 38 44 46 47 48 50 ");
        break;
        
    }


  }

}
