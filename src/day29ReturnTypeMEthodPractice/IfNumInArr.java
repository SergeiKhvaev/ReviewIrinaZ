package day29ReturnTypeMEthodPractice;

public class IfNumInArr {
    /*
    Contains
create a method that will accept an int array and an int number.
Check and return if the given number is in the array.

     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6};
        //System.out.println(isNumInArr(arr, 98));

        System.out.println(isNumInArr2(arr, 99));

    }

    public static String isNumInArr(int[] arr, int number) {
        String inArr = "";
        for (int each : arr) {
            if (each == number) {
                inArr = "Contains";
                break;
            } else {
                inArr = "Not contains";
            }

        }
        return inArr;

    }

    public static boolean isNumInArr2(int[] arr, int number) {
        boolean inArr = true;
        for (int each : arr) {
            if (each == number) {
                inArr = true;
                break;
            } else {
                inArr = false;
            }

        }
        return inArr;


    }
}