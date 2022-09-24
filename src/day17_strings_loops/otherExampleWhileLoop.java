package day17_strings_loops;

public class otherExampleWhileLoop {
    public static void main(String[] args) {

        char first = 'A';
        while (first <= 'Z') {
            System.out.print(first++); // все печатаем в одну линию
            //  System.out.println(first++); все печатаем сверху вниз
        }
        System.out.println("--------------------------------------");

 char lowerCase = 'z';
 while (lowerCase >= 'a'){
            System.out.print(lowerCase--); // печатает в одну линию

        }


    }

}
