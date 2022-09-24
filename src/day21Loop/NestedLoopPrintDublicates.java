package day21Loop;

public class NestedLoopPrintDublicates {
    public static void main(String[] args) {

        String str = "ddfdfffdfdfff nbb";
        String checked = "";

        for(int i = 0; i < str.length() ; i++){
            int counter = 0;
            if(checked.contains("" + str.charAt(i))){
                continue;
            }
            for(int j = 0; j < str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
                               }// inner
            if(counter > 1){
                System.out.println(str.charAt(i) + " " + str.indexOf(str.charAt(i)));

            }

            checked+= str.charAt(i);
        }// outer



    }
}
