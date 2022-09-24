package adamofficehours.day6;

public class RemoveExtraSpasesFromString {
    /*
      Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java

     */
    public static void main(String[] args) {

        System.out.println(withoutExtraSpaces("  Hello world      I      love      Java    "));
    }

    public static String withoutExtraSpaces (String str){
        String trimed = str.trim(); // removed spases in the beginning and at the end of String
        String [] arr = str.split(" ");// split string to String[}/ we got arr{"elemetn", "empty-where element is stil spase"
        String strWithoutSpases ="";
        for(String each : arr){
            if(!each.isEmpty()){
                strWithoutSpases += each +" ";
            }
            }
        return strWithoutSpases.trim(); // remove spase in the end of str

        }


    }


