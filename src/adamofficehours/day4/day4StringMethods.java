package adamofficehours.day4;

import java.net.SocketImpl;

public class day4StringMethods {
    public static void main(String[] args) {
        // поставить первое слово в конец строки
        //1 берем первое слово -> можно взять сабстринг или использовать indexOf(first space)

        String sentence = "Java is a fun language";
        int indexOfirstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, indexOfirstSpace);
        System.out.println("First word - " +firstWord);
String secondPart = sentence.substring(indexOfirstSpace +1);
        System.out.println(secondPart + " " +  firstWord);


        System.out.println("=======================================================");

        ///search result:

        String str = "About 540,000,000 results (0.78 seconds)";
        int indexFirstSpace = str.indexOf(" ");
        int indexOfSecondSpace = str.indexOf(" r");
        String resultNumber = str.substring(indexFirstSpace+1, indexOfSecondSpace);
        int indexOfFirstPar = str.indexOf("(");
        int indexOfSecondPar = str.indexOf(" s");
        String responseTime = str.substring(indexOfFirstPar + 1, indexOfSecondPar);

        System.out.println("Result number - " + resultNumber);
        System.out.println("Responce time - " + responseTime + " seconds");


        System.out.println("=======================================================");

        // используя лууп выведите отдельно буквы верхнего, нижнего регистра и буквы

       String input = "dfdfdSDSDSSD123456";
     String upper =" ";
      String lower = " ";
      String numbers = " ";

       for(int i = 0; i < input.length(); i++) {
           if(input.charAt(i) >= 'a' && input.charAt(i) <='z'){
               lower+= input.charAt(i);
           }else if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
               upper+= input.charAt(i);
           }else if(input.charAt(i) >= '1' && input.charAt(i) <= '9'){
               numbers+= input.charAt(i);
           }
       }
        System.out.println("Upper letter - " + upper);
        System.out.println("Lower letter - " + lower);
        System.out.println("Numbers - " + numbers);

        System.out.println("=======================================================");

String str2 = "Cybertek";

        char firstCh = str.charAt(0);
        char secondtCh = str.charAt(1);
        char thirdChr = str.charAt(2);
        char lastChr = str.charAt(str.length() -1);

        // better and faster to use loop
        for(int i = 0 ; i < str2.length() ; i++){
          //char ch = str2.charAt(i);
            System.out.println(str2.charAt(i));
            }
        System.out.println("=========================================");
// 1)распечатать кол-во слов
// 2)распечатать каждое слово отдельно

String str4 = "iyILoveJavaVeryMuch";
int checker = 0;

for(int i = 0; i < str4.length(); i ++){
    if(str4.charAt(i) >= 'A' && str4.charAt(i) <= 'Z'){
checker++;
    }
}
        System.out.println(checker+1);















}
}
