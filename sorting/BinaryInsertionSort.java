/**
* Binary Insertion Sort uses binary search to find the proper location to insert the selected item at each iteration.
* This reduces the number of comparisons in normal insertion sort.
* In normal insertion sort, it takes O(n^2) comparisons(at nth iteration) in worst case. We can reduce it to O(log n) by using binary search.
**/

public class BinaryInsertionSort {
   
   public void sort(int[] arr){
    
    for(int elementIndex = 1; elementIndex < arr.length ;elementIndex++){
      int element = arr[elementIndex];
      
      // Find location to insert using binary search 
      int position = Math.abs(Arrays.binarySearch(arr , 0 , elementIndex ,element) + 1);
      
      //Shifting array to one location right 
      System.arraycopy(array, position, array, position+1, position-elementIndex); 
  
      //Placing element at its correct location 
      array[position] = element; 
    }
   
   }

}
