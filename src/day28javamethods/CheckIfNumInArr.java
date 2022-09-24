package day28javamethods;

public class CheckIfNumInArr {
/*
Contains
create a method that will accept an int array and an int number.
Check and return if the given number is in the array.

 */
public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,6};
    System.out.println(inArr(arr, 6));
}

    public static String inArr (int [] arr, int num){
        String str = "";
        for(int each : arr){
            if(each == num){
                 str = "true";
                 break;
            }else {
                 str = "false";
            }
        }
        return str;

    }

}
