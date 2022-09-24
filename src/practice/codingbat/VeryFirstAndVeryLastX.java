package practice.codingbat;

public class VeryFirstAndVeryLastX {
/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") ? "xHix" my answer xHix
stringX("abxxxcd") ? "abcd" my answer abcd
stringX("xabxxxcdx") ? "xabcdx" my answer xabcdx


rigth solution

public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    // Only append the char if it is not the "x" case
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    }
  }
  return result;
 */

    public static void main(String[] args) {
        //System.out.println(stringX("xxHxix"));

        String str1 = "abxxxcd";

        String result ="";
        for(int i = 0 ; i < str1.length(); i++){
            if(!(i > 0 && i < str1.length() -1 && str1.charAt(i) == 'x')){
                result += str1.charAt(i);
            }
        }
        System.out.println(result);



    }


    // that code almoust works

    public static String stringX(String str) {
        String newStr = "";
        if(str.charAt(0) =='x'){
            newStr += str.charAt(0);
        }
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != 'x') {
            newStr += str.charAt(i);
        }
    }
        if(str.charAt(str.length()-1) == 'x'){
            newStr += str.charAt(str.length() -1);
        }
        return newStr;
    }
}
