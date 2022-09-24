package adamofficehours.day6;

public class IsArmstrongNumMath {
    /*
    Task 2 :   Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

     */
    // 153

    public static void main(String[] args) {
        System.out.println(isArmstrongNum(407));
    }
       public static boolean isArmstrongNum(int number){
        int lastDigit = number % 10; // 3
        int forSecondDigit = number /10; //15
        int secondDigit = forSecondDigit % 10; // 5
        int thirdDigit = number / 100; //1

        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);
        if (number == total){
            return true;
        }
        return false;
}


}

