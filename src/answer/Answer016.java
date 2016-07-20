package answer;
/*
문자열을 입력 하세요. circleofnumbers
b: 1
c: 2
e: 2
f: 1
i: 1
l: 1
m: 1
n: 1
o: 1
r: 2
s: 1
u: 1
*/
import java.util.Scanner;

public class Answer016 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("문자열을 입력 하세요. ");
    String str = keyScanner.nextLine().toLowerCase();
    char[] chars = str.toCharArray();
    int[] count = new int[26];

    for (int i = 0; i < count.length; i++) {
      count[i] = 0;
    }

    for (int i = 0; i < chars.length; i++) {
      count[chars[i] - 'a']++;
    }

    for (int i = 0; i < count.length; i++) {
      if ( count[i] == 0 ) {
        continue;
      }
    System.out.printf("%c: %d\n",(char)(i + 'a'), count[i]);
    }

  }
}
