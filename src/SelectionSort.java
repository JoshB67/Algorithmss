public class SelectionSort {
  
  private static int[] myArr = {5,4,3,2,1};
  
  public static int[] selectionSort(int[] arr) { // 5 2 2 3
    int i = 0;
    int j = 0;
    int minValue = 0;
    int minIndex = 0;
    int temp = 0;
    
    for (i = 0; i < arr.length - 1; i++) {
      minValue = arr[i];
      minIndex = i;
      
      for (j = i + 1; j < arr.length; j++) {
        if(minValue > arr[j]) {
          minValue = arr[j];
          minIndex = j;
        }
      }
    if (minValue < arr[i]) {
      temp = arr[i];
      arr[i] = minValue;
      arr[minIndex] = temp;
    }
    
  }
  return arr;
}
  
  public static void main(String[] args) {
    for (int x : SelectionSort.selectionSort(myArr)) {
    System.out.println(x);
      }
  }
  
}
