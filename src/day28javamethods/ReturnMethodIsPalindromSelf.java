package day28javamethods;

public class ReturnMethodIsPalindromSelf {

    /*
    create a method that will that will accept a String and
find if it is Palindrome or not (boolean)

     */
    public static void main(String[] args) {

      // System.out.println(reverse("anna"));

     //  System.out.println (isPalindrom("Sergei"));

        System.out.println(isPalindrom2("abbaa"));
    }



    public static  String reverse (String str){ // создали метод который будет реверсировать слова
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
            }
              return reverse;
    }

    public static boolean isPalindrom (String str){// создали отдельный метод проверки палиндрома, внутри которого используем ранее созданный метод reverse
        return reverse(str).equals(str);

    }

public static boolean isPalindrom2 (String str){ // объединили два кода. 1. код строит реверс слова 2. проверяет boolean палиндром или нет
    String reverse = "";
    for(int i = str.length()-1; i >= 0; i--){
        reverse += str.charAt(i);
    }
        return reverse(str).equals(str);


}


}
