

public class Test {

  public static void main(String[] args) {

  // Exercise.exam();

  char[] ch = args[0].toLowerCase().toCharArray();
  int[] count = new int[26];

  for (int i = 0; i < count.length; i++){
    count[i] = 0;
  }

  for (int i = 0; i < ch.length; i++) {
    count[ch[i] - 'a']++;

  }

  for (int i = 0; i < count.length; i++) {
    if (count[i] <= 0)
      continue;
    System.out.printf("%c: %d \n", (char)(i + 'a'), count[i]);
  }



  }
}
