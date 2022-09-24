package day29ReturnTypeMEthodPractice;

public class MethodExtraPractice {
    /*
Create a method that accept an int array.
Take the sum of all the numbers and return the sum

     */

    public static void main(String[] args) {
        int[] arr1 = {1,5,1,4,9,75,99};

        System.out.println(arrSum(arr1)); // int sum = arrSum(arr1) - norm as well


       double result = convertedCur("yen", 100);

        System.out.println(result);
        System.out.println(convertedCur("won", 100));
        System.out.println(convertedCur("EURO", 100));
        System.out.println(convertedCur("ru", 100));

    }

    public static int arrSum (int[] arr){
        int result = 0;
        for(int each : arr){
            result += each;
        }

        return result;
    }

    /*
Currency Converter

create a method that will accept a currency type(String) and a currency
amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given
dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

     */

    public static double convertedCur (String curName, int dollAmount){
        double converted = 0;
        switch(curName.toLowerCase()){
            case "euro":
               converted = dollAmount * 0.91;
                break;
            case "yen":
                converted = dollAmount * 121.03;
                break;
            case "lira":
                converted = dollAmount * 14.85;
                break;
            case"won":
                converted = dollAmount * 1_217.52;
                break;
            case "rupee":
                converted = dollAmount * 181.45;
                break;
            default:
                System.out.println("Invalid currency " + curName);
                }
         return converted;





    }




}
