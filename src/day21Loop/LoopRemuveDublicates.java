package day21Loop;

public class LoopRemuveDublicates {
    public static void main(String[] args) {

        // remove dublicated letters in given string

        String str = "abcabcf";
        String strNew = ""; // создаем, что бы в нее добавлать символы, отвечающие условиям цикла и if statment внутри цикла

      for (int i = 0; i < str.length(); i++) {
        if(!strNew.contains("" + str.charAt(i))) {
            strNew = strNew + str.charAt(i);
        }
          }
      System.out.println(strNew);

        System.out.println("===================Alternative=======================");

        String str1 = "abcabcf";
        String newStr1 = "";

        for(int i = 0; i < str1.length(); i++) {
            if (newStr1.contains(str.substring(i, i+1))){
                continue;
            }
            newStr1+= str1.charAt(i);
        }

        System.out.println((newStr1));


        System.out.println("===================Alternative=======================");
      String str2 = "abcabcccb";
       String newStr2 = "";

       for(int i = 0; i < str2.length()-1; i++) {
           if(str2.charAt(i) != str2.charAt(i+1)){
            if (!newStr2.contains("" + str2.charAt(i))){
               newStr2+= str2.charAt(i);

           }
       }

       }
        System.out.println((newStr2));

    }
    }
