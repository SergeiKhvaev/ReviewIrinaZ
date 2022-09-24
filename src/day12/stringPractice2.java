package day12;

public class stringPractice2 {

    public static void main(String[] args){


        String str = "            java               "; // можно истопльзовать метор trim и убрать пустые пробелы сначала и вконце

        System.out.println(str.length());

      String  str1 = str.trim();

      System.out.println(str.trim()); // использовали метод и распечатали его, метод автоматически создал новую строку без пробелов
      System.out.println(str); // сохранили и распечатали оригинальную строку с пробелами
      System.out.println(str1); // положили значение, к которой применили метод в новую переменную, назвали ее и распечалали новую строку без пробелов







    }
}
