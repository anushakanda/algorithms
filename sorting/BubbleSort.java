/**
* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. 
* Bubble sort and insertion sort are stable algorithms,which maintain the relative order of equal items.
*
* Worst Case :0(n^2)
* Best Case :0(n)
* Auxillary space:0(1)
**/
public class BubbleSort{

 public void sort(int[] arr){
   for(int outer = arr.length-1;outer >0;outet--){
    for(int inner = 0;inner< arr.length-1;inner++){
      if(arr[inner] > arr[inner+1]){
        int temp = arr[inner];
        arr[inner] = arr[inner+1];
        arr[inner+1] = temp;
      }
     }
    }
 
 //The above function always runs O(n^2) time even if the array is sorted. 
 //It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
 public void optimizedSort(int[] arr){
  for(int outer = arr.length-1;outer >0;outet--){
    boolean isSwapped = false;
    for(int inner = 0;inner< arr.length-1;inner++){
      if(arr[inner] > arr[inner+1]){
        isSwapped = true;
        int temp = arr[inner];
        arr[inner] = arr[inner+1];
        arr[inner+1] = temp;
      }
    }
    if(!isSwapped){
      break;
    }
  }
  
public void recursiveSort(int[] arr, int size){
  if(size =1){
  return;
  }
  
  // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end. 
  for(int inner = 0;inner< size-1;inner++){
      if(arr[inner] > arr[inner+1]){
        isSwapped = true;
        int temp = arr[inner];
        arr[inner] = arr[inner+1];
        arr[inner+1] = temp;
      }
    }
   
   //Largest element is fixed,recur for remaining array.
   recursiveSort(arr,size-1);
  }
  
}
    
     
