public class BucketSort{
  
  private static int[] myArr = {5,4,3,2,1};
  
  public static int[] bucketSort(int[] arr, int maxVal) {
    int[] bucket = new int[maxVal + 1];
    
    for(int i = 0; i < bucket.length; i++){
      bucket[i] = 0;
    }
    
    for(int j = 0; j < arr.length; j++){
      bucket[arr[j]]++;
    }
    
    int outPos = 0;
    for(int i = 0; i < bucket.length; i++){
      for(int j = 0; j < bucket[i]; j++){
        arr[outPos++] = i;
      }
    }
 	return arr;
}
  
  public static void main(String[] args) {
    for(int x : BucketSort.bucketSort(myArr, 5)){
      System.out.println(x);
    }
  }
}