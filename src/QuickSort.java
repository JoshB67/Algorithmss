public class QuickSort {
  
  private static int[] myArr = {5,3,2,1};
  
  public static int[] quickSort(int[] arr, int low, int high) { // 411511
    if (arr == null || arr.length == 0 || low >= high) {
      return arr;
    }

    
    int middle = low + (high - low)/2;
    int pivot = arr[middle];
    int i = low; 
    int j = high;
      
    while (i <= j) {
      while (arr[i] < pivot) {
        i++;
      }
      while (arr[j] > pivot) {
        j--; 
      }
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    
    if (low < j){
      quickSort(arr, low, j);
    }
    if (high > i) {
    	quickSort(arr, i, high);
    }
    
    return arr;
  }
  

  public static void main(String[] args) {
    for (int x : QuickSort.quickSort(myArr,0,3)) {
      System.out.println(x);
  }
  
 }
  
}