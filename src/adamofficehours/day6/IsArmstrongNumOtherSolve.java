package adamofficehours.day6;

public class IsArmstrongNumOtherSolve {
    public static void main(String[] args) {
       /*
       Task 2 :   Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

        */


        System.out.println(isArmstrongOtherSolv(407));
    }

    public static boolean isArmstrongOtherSolv(int number){

       String str = Integer.toString(number); // перевели int в string
       String [] arr = str.split(""); // перевели String в String arr where each element = single digit
        int  firstDigit = Integer.parseInt(arr[0]);//1
        int secondDigit = Integer.parseInt(arr[1]);//5
        int thirdDigit = Integer.parseInt(arr[2]);//3

        if((firstDigit * firstDigit * firstDigit)+(secondDigit * secondDigit * secondDigit)+ (thirdDigit * thirdDigit * thirdDigit) == number) {
            return true;
        }
        return false;
    }

}
