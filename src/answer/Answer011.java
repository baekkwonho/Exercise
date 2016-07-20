package answer;
/*
List1 : 1, 2, 4, 7, 11, 9
List2 : 1, 2, 4, 7, 11, 9
*/

public class Answer011 {

  public static void main(String[] args) {
    
    int[] List1 = {1, 2, 4, 7, 11, 9};
    int[] List2 = new int[List1.length];
    
    for (int i = 0; i < List1.length; i++) {
      List2[i] = List1[i];
    }
    
    System.out.print("List1 : ");
    for (int i = 0; i < List1.length; i++) {
      if (i == 0) {
        System.out.printf("%d",List1[i]);
      } else {
        System.out.printf(", %d", List1[i]);
        }
    }
    System.out.println();
    
    System.out.print("List2 : ");
    for (int i = 0; i < List2.length; i++) {
      if (i == 0) {
        System.out.printf("%d",List2[i]);
      } else {
        System.out.printf(", %d", List2[i]);
        }
    }
    System.out.println();
    
  }

}
