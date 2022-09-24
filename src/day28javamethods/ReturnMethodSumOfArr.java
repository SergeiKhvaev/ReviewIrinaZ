package day28javamethods;

public class ReturnMethodSumOfArr {
    public static void main(String[] args) {


        int [] arrFir = {3,100,3};// 106
        int [] arrSec = {50, 40, 5}; // 95
        System.out.println(sumOfArrays(arrFir, arrSec));// 201
        System.out.println(sumArr(arrFir));//106
    }



public static int sumArr(int [] arr){ // создали метод, который будет ссумировать элементы одного данного массива
        int sum = 0;
        for(int each : arr){
            sum += each;
        }
        return sum;
}

    public static int sumOfArrays (int [] arr1, int [] arr2){ // создали метод, который будет суммировать элементы двух данных массивом
        int sum1 = 0;
        for(int each : arr1){
            sum1 += each;
        }
        int sum2 = 0;
        for(int each : arr2){
            sum2 += each;
        }

        int total = sum1 + sum2;
        return total;

    }
}
