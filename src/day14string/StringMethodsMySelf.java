package day14string;

public class StringMethodsMySelf {
    public static void main(String[] args) {

        String str1 = "Sergeiera";
        String str2 = "Khvalev";
        String str3 = "Eva111111111";
        if(str1.length() > str2.length() && str1.length() > str3.length() && str1.contains("a")){
            System.out.println(str1);
        } else if (str2.length() > str3.length() && str2.contains("a")) {
            System.out.println(str2);
        } else if (str3.contains("a")) {
            System.out.println(str3);
        }

        System.out.println("------------------------------------------");
        // other way
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        int word1Len = word1.length();
        int word2Len = word2.length();
        int word3Len = word3.length();

        if(word1.contains ("a") && word1Len > word2Len && word1Len > word3Len) {
            System.out.println(word1 + " is the longest with a");
        } else if (word2.contains("a") && word2Len > word1Len && word2Len > word3Len) {
            System.out.println("word 2");
        } else if (word3.contains("a") && word3Len > word1Len && word3Len > word2Len) {
            System.out.println(word3);
        } else {
            System.out.println("no longest word");
        }


        System.out.println("_----------------------------------------------------");
// найти самое длинное слово содержащее букву а
        String word11 = "javaaaa";
        String word22 = "appledsdsds";
        String word33 = "computerarrrerer";

        String longest = "";

        if (word11.contains("a") && word11.length() > longest.length()){
            longest = word11;
        }

        if (word22.contains("a") && word22.length() > longest.length()){
            longest = word22;
}

         if (word33.contains("a") && word33.length() > longest.length()) {
             longest = word33;
        }


        System.out.println(longest);

    }


}
