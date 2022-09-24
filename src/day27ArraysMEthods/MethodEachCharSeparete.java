package day27ArraysMEthods;

public class MethodEachCharSeparete {
    public static void charOfWord (String word){
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }


    }

    public static void main(String[] args) {

        charOfWord("Sergei");
    }
}
