package day29ReturnTypeMEthodPractice;

import my_utils.StringUtil;

public class DuplicatesChar {
    // print dublicated char

    public static String getduplicateCharacters (String str){
        String dublicate ="";
        for(int i =0; i < str.length(); i++){
            // str.char(i) give me every char

            if(dublicate.contains("" + str.charAt(i))){// если дубликат буквы уже попоался то пропустить код
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if( frequency > 1) {
                dublicate += str.charAt(i);
            }
        }

        return dublicate;

    }

    public static void main(String[] args) {
        System.out.println(getduplicateCharacters("starovoitova"));
    }


}
