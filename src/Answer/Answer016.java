package Answer;


public class Answer016 {

  public static void main(String[] args) {

    char[] chars = args[0].toLowerCase().toCharArray();
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
