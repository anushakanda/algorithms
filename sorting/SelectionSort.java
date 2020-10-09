/**
* The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array.
*
* Worst,Best and Average time complexity : O(n*2)
* Space complexity : O(1)
* Stability : The default implementation is not stable. However it can be made stable. Please see stable selection sort for details.
**/

public class SelectionSort{

  public void sort(int[] arr){
  
  for(int outer = 0;outer< arr.length-1; outer++){
      int minIndex = outer;
      for(int inner = outer+1 ; inner < arr.length; inner++){
          if(arr[inner] < arr[minIndex]){
             minIndex = inner;
          } 
       }
       
       if(outer!=minIndex){
         int tmp = arr[outer];
        arr[outer] = arr[minIndex];
        arr[minIndex] = tmp;
       }
  }

}
