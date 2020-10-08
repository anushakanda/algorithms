public class SelectionSort{

  public void sort(int[] arr){
  
  for(int outer = 0;outer< arr.length-1; outer++){
      int tmp = arr[outer];
      int minIndex = outer;
      for(int inner = outer; inner < arr.length-1; inner++){
          if(arr[inner] < arr[minIndex]){
             minIndex = inner;
          } 
       }
       
       if(outer!=minIndex){
        arr[outer] = arr[minIndex];
        arr[minIndex] = tmp;
       }
  }

}
