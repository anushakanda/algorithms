public class CapitalizeFirstLetterOfString {
    
  public static void main(String[] args){
      List<String> messages = Arrays.asList("hello", "hi", "readers!","welcome"); 
      // Approach 1: Using custom defined function.
      messages.stream().map(message -> capitalize(message)).forEach(message-> System.out.println(message));
      //Using method reference the above code can be written as
      messages.stream().map(CapitalizeFirstLetterOfString::capitalize).forEach(System.out::println);
    
     //Approach 2:Use capitalize method in StringUTils from Apache commons
      messages.stream().map(StringUtils::capitalize).forEach(System.out::println);
  }
  
  private static String capitalize(String str){
    if(str == null ||str.isEmpty()){
      return str;
    }
    
    String firstCharacter = str.subString(0,1).toUpperCase();
    String capitalizedString = firstCharacter + str.subString(1);
    
    return capitalizedString;
  }
}

//Things to learn:
//1. Type Inference
//2. Method Reference
//3. String inbuilt methods
