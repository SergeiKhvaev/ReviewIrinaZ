package adamofficehours.day6;

public class pascalCaseToSnakeCase {
    /*
     Task 4 :     Convert PascalCase to snake_case  --- Interview Task
    			  write a method that get pascal case and convert to pascal case to snake case and return it
                  "TestController"  --> "test_controller"
                  "MoviesAndBooks"  --> "movies_and_books"
                  "App7Test"        --> "app7_test"
                  "1"               --> "1"

     */
    public static void main(String[] args) {
        System.out.println(pascalToSnake("App7Test"));
    }
   // String str = "TestController";--> "test_controller"
    public static String pascalToSnake (String str){
        String snakeCase ="";
        for(int i = 0; i < str.length(); i ++){
            if(Character.isUpperCase(str.charAt(i))){
                snakeCase += "_" +str.toLowerCase().charAt(i);
                }else {
                snakeCase +=str.charAt(i);
            }
        }
        return snakeCase.substring(1);
    }
}
