package usefullnotes.WayToCreate;

public class HowToCreateString {
    public static void main(String[] args) {
        // Two ways to create String object
        // 1. literal way
        // 2. use "new" key word

        // 1. literal way
        String word1 = "I love java";
        String word2 = "I love java";

        System.out.println(word1 == word2);// true because one object was created in memory
        System.out.println(word1.equals(word2));// true - regular way to compare Strings

        System.out.println("==============================");
        // 2. use "new" key word
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1 == str2); // false because two different objects was created in memory
        System.out.println(str1.equals(str2));//// true - regular way to compare Strings



    }
}
