package answer;
/*
Origin List : 1, 2, 4, 7, 11, 9, 30, 3
Change List : 11, 9, 30, 3, 1, 2, 4, 7
*/

public class Answer013 {
  
  public static void main(String[] args) {
    
    int[] list = {1, 2, 4, 7, 11, 9, 30, 3};
    int count = list.length / 2;
    int temp;
    
    System.out.print("Origin List : ");
    for (int i = 0; i < list.length; i++) {
      if ( i == 0) {
        System.out.printf("%d", list[i]);
      } else {
        System.out.printf(", %d", list[i]);        
      }
    }
    System.out.println();
    
    for (int i = 0; i < count; i++) {
      temp = list[count + i];
      list[count + i] = list[i];
      list[i] = temp;
    }
    
    System.out.print("Change List : ");
    for (int i = 0; i < list.length; i++) {
      if ( i == 0) {
        System.out.printf("%d", list[i]);
      } else {
        System.out.printf(", %d", list[i]);        
      }
    }
    System.out.println();
    
  }

}
