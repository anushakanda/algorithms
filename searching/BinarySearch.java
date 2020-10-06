/**
 * BinarySearch: Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
 *
 * Time complexity : O(log n)
 * Auxillary space : O(1) in iterative; O(log n) in recursive.
 *
 **/

Public class BinarySearch(){
 
 //In Built binarySearch() method
 public int usingInBuiltMethod(){
   int index = Arrays.binarySearch(sortedArray, key);
   int index = Collections.binarySearch(sortedList, key);
 }
 
 //Iterative approach
 public int getElementPosition(int[] arr,int elem){
    int lowerIndex = 0;
    int higherIndex = arr.length - 1;
    
    while(lowerIndex < = higherIndex){
      int midIndex = (lowerIndex + higherIndex)/2;
      int midElem = arr[midIndex];
      if(midElem == elem){
        return midIndex;
      }else if(midElem < elem){
       lowerIndex = midIndex +1;
      }else if(midElem > elem){
       higherIndex = midIndex - 1;
      }
    }
    
    return -1;
 }
 
 //Recursive approach
 public int getElementPosition(int[] arr,int elem, int lowerIndex, int higherIndex){
     if(lowerIndex < = higherIndex){
        int midIndex = (lowerIndex + higherIndex)/2;
        int midElem = arr[midIndex];
        
        if(midElem == elem){
          return midElem;
        }else if(midElem < elem){
          getElementPosition(arr, elem, midIndex +1, higherIndex);
        }else if(midElem > elem){
          getElementPosition(arr, elem, lowerIndex, midIndex-1);
        }
      }
      return -1;
 }

}
