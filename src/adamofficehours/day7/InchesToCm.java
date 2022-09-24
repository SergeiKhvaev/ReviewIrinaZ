package adamofficehours.day7;

public class InchesToCm {
    /*
    Task 1 :   Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
			   Feet is the first parameter, inches is the second parameter.
				- You should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12.
					 Return -1 from the method if either of the above is not true.
				- If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this 		  method and return that value.
				- Create a second method of the same name but with only one parameter inches is the parameter and validate it 		  >=0, return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
				- Call the other overloaded method passing the correct feet and inches calculated so that it can calculate 				correctly.
				- Hints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches

1 foot is 12 inches
В футе 30.48 сантиметров
1 inche is = 2,54 cm


     */

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(-1, 3)); // 99.06
        System.out.println(calcFeetAndInchesToCentimeters(1));


    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
double cmFromFoot = 0;
double  cmFromInch = 0;
;
        if (feet >= 0 && inches >= 0 && inches <= 12){
            cmFromFoot = feet * 30.48;
            cmFromInch = inches * 2.54;
   return cmFromInch + cmFromFoot;

        } else {
return -1;
        }
    }

    /*
    - Create a second method of the same name but with only one parameter inches is the parameter and validate it 		  >=0, return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
				- Call the other overloaded method passing the correct feet and inches calculated so that it can calculate 				correctly.
				- Hints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches

     */


    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet = 0;
        if(inches >= 0){
            feet = inches / 12;
            return feet;

        } else {
            return -1;
        }


    }

}
