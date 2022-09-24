package practice.codingbat;

public class PrintEachUnicChar {
    public static void main(String[] args) {
        String str = "Hi";
        System.out.println(stringBits(str));
    }



    public static String stringBits(String str) {
        String eachUniq = ""+ str.charAt(0);
        for(int i = 0 ; i<str.length(); i++){
         //   eachUniq = "" + str.charAt(i);
            if(!eachUniq.contains("" + str.charAt(i))){
                eachUniq += str.charAt(i);
            }else{
                eachUniq +="";
            }
        }
        return eachUniq;

    }



}
