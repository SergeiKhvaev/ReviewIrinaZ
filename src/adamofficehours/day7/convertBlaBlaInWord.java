package adamofficehours.day7;

import java.util.Arrays;

public class convertBlaBlaInWord {
    /*
    Task 3:
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
					Write a method that returns : Welcome To Core Java
     */

    public static void main(String[] args) {
        System.out.println(words("(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a"));

        System.out.println(wordsAnotherWay("W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a"));

        int a = 35;
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        System.out.println(Character.isAlphabetic(str.charAt(3)));
        System.out.println(Character.isLetter(str.charAt(3)));


    }
public static String words(String str){
        String word ="";
                for(int i = 0 ; i < str.length(); i++){
                   // char char1 = str.charAt(i);
                    if(Character.isLetter(str.charAt(i))){
                     //   Character.isAlphabetic(str.charAt(i)))
                        word += str.charAt(i);
                    }
                }

                String sentence ="" + word.charAt(0);
                for(int i = 1; i < word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        sentence += " " + word.charAt(i);
                    }else {
                        sentence += word.charAt(i);
                    }
                }

                return sentence;
}

//=======================================
    // or we can use str.toCharArray();
    // or we can use str.split("");

    public static String wordsAnotherWay(String str){
        String word ="";
        for(int i = 0 ; i < str.length(); i++){
            // char char1 = str.charAt(i);
            if(Character.isLetter(str.charAt(i))){
                //   Character.isAlphabetic(str.charAt(i)))
                word += str.charAt(i);
            }
            if (str.charAt(i) == ' '){
                word += str.charAt(i);
            }
        }
return word;

        }


}
