/**
* Insertion sort is based on the idea that one element from the input elements is consumed in each iteration to find its correct position i.e, the position to which it belongs in a sorted array.
* To sort an array of size n in ascending order:
* 1: Iterate from arr[1] to arr[n] over the array.
* 2: Compare the current element (key) to its predecessor.
* 3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.
*
* Time Complexity : 
* Worst Case :0(n*2) -- when array is reverse sorted.
* Best Case : 0(n) -- when array is already sorted
* Average case :0(n*2)
* 
* Auxiliary Space : 0(1)
*
* Stable :Yes (relative position of equal elements)
*
* Uses : Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
*
* Improvement :Binary Insertion sort
**/

public class InsertionSort(){
 
 void sort(int arr[]){
   int size = arr.length();
   
   for(int i = 1; i < size; i++){
      //value
      int currentElement = arr[i];
      //hole
      int leftIndex = i-1;
      
      //Move greater elements 1 space up.
      while(leftIndex > 0 && currentElement < arr[leftIndex]){
         arr[leftIndex + 1 ] = arr[leftIndex];
         leftIndex--;
        
      }
      
      //assign value to hole
      arr[leftIndex =1] = currentElement;
   }
 }

}
