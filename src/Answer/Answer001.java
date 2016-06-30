package Answer;
/*
1 3 4 6 7 8 9 12 
*/

public class Answer001 {

  public static void main(String[] args) {
    
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    
    int tmp, count = 0;
    int end = arr.length - 1;
    
    while ( end >= 1) {
      count = 0;
      while (count < end) {
        if ( arr[count] > arr[count + 1]) {
          tmp = arr[count];
          arr[count] = arr[count + 1];
          arr[count + 1] = tmp;
        } 
        count++;
      }
      end--;
    }

    count = 0;
    while (count < arr.length){
      System.out.printf("%d ", arr[count++]);
    }
    System.out.println();
  }

}
