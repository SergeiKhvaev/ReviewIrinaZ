package day29ReturnTypeMEthodPractice;

import day28javamethods.ReturnMethodCurrConverter;
import my_utils.StringUtil;

public class TestCalling {
    public static void main(String[] args) {
        int [] arr =  {1,2,3};
        System.out.println(MethodExtraPractice.arrSum(arr));

        double value = MethodExtraPractice.convertedCur("euro", 100);
        System.out.println(value);


        System.out.println(ReturnMethodCurrConverter.curConverter3("euro",1));

        System.out.println(StringUtil.camleCase("JAVA WiLL RUle THE worlD"));


    }



}
