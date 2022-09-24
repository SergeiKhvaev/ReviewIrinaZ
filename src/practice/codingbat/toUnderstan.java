package practice.codingbat;

public class toUnderstan {
    public static void main(String[] args) {
        String str = "x";

       System.out.println(stringX(str));



    }
   public static String stringX(String str) {
        String newStr = "" + str.charAt(0);
        String subStr = str.substring(1, str.length()-1);
        for(int i = 0; i < subStr.length(); i++){
            if(subStr.charAt(i) != 'x'){
                newStr +=subStr.charAt(i);
            }
        }

        newStr += str.charAt(str.length()-1);

        return newStr;
    }


}
