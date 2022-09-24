package day21Loop;

public class NestedLoopPrintFirstDublicatSelf {

    public static void main(String[] args) {

        String str = "dvljjkkk"; // вывести первые первую встречающуюся букву дубликат
        String checked = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }// inner
            if(count > 1){
                System.out.println(str.charAt(i));
                System.out.println(str.indexOf(str.charAt(i)));
                break;
            }



        }// outter




    }

}
