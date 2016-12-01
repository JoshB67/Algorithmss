public class BubbleSort {
  
  private static int[] myArr = {5,4,3,2,1};
  
  public static int[] bubbleSort(int[] arr) {
    boolean swapped = true;
    int j = 0;
    int temp = 0;
    
    while(swapped) {
      swapped = false;
      j++;
    
        for(int i = 0; i < arr.length - j; i++) {
        if(arr[i] > arr[i + 1]) {
          temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }
  }
    return arr;
  }
  
  public static void main(String[] args) {
    for(int x : BubbleSort.bubbleSort(myArr)) {
      System.out.println(x);
    }
  }
}