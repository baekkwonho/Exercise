package answer;
/*
정렬전: 3 44 38 5 47 15 36 26 27 2 46 4 19 50 48 
정렬후: 2 3 4 5 15 19 26 27 36 38 44 46 47 48 50 
*/

public class Answer052 {
  
  static int[] element = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
  
  public static void main(String[] args) {
    
    System.out.print("정렬전: ");
    print();
    quickSort(0, element.length - 1);
    System.out.print("정렬후: ");
    print();
  }
  
  static void quickSort(int startIndex, int endIndex) {
    if (endIndex <= startIndex)
      return;
    int pivotIndex = startIndex;
    int storeIndex = pivotIndex + 1;
    
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (element[i] < element[pivotIndex]) {
        swap(i, storeIndex);
        storeIndex++;
      }
    }
    swap(pivotIndex, storeIndex - 1);
    quickSort(startIndex, storeIndex - 2);
    quickSort(storeIndex, endIndex);
  }
  
  
  
  static void swap(int index1, int index2) {
    if (index1 == index2)
      return;
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print() {
    for (int value : element) {
      System.out.printf("%d ", value);
    }
    System.out.println();
  }

}
