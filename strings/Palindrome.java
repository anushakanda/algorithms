public class Palindrome {
    public int isPalindrome(String A) {
         if( A== null || A.isEmpty()){
           return 1;
         }
        
        //Consider only alphanumeric and case insesitive.
        String alphaNumericString = A.toLowerCase().replaceAll("[^a-z0-9]","");
     
        int length =  alphaNumericString.length();
        boolean isPalindrome = IntStream.range(0,length/2).noneMatch(i->alphaNumericString.charAt(i)!=alphaNumericString.charAt(length-i-1));
      
        return isPalindrome? 1:0;
    }
}

//Things to learn:
//1. Edge Cases
//String Immutable concepts, Removing special characters, Regex,IntStream
