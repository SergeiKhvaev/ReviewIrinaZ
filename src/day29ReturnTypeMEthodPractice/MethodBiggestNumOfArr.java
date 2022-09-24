package day29ReturnTypeMEthodPractice;

public class MethodBiggestNumOfArr {
    /*
    Max Number
create a method that will accept an int array and
return the biggest number from the array
     */

    public static void main(String[] args) {

        int biggest = (biggestNumOfArr(100,99,3,5));
        System.out.println(biggest);

    }

    public static int biggestNumOfArr (int...arr){
        int biggestNum = 0;
        for(int each : arr){
            if(each > biggestNum){
                biggestNum = each;
            }
        }
        return biggestNum;
    }

}


