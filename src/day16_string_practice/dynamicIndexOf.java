package day16_string_practice;
import java.util.Scanner;

public class dynamicIndexOf {
    public static void main(String[] args) {
        // find oll the indexes  'i'
        String str = "definition";

        System.out.println("First I : " + str.indexOf('i'));
        System.out.println("List I : " + str.lastIndexOf('i'));


        System.out.println("other use of indexof");


        System.out.println("First I : " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i', 4)); // начнет искать с index под номером 4
        System.out.println("Second i: " + str.indexOf('i', 6)); // начнет искать с index под номером 6

        System.out.println(" динамически подход==========================================");
        // 'этот код более динамичный, т.к. мы ввели переменные, также, если мы будеет использовать сканнер этот код будет искать индексы повтор€ющихс€ букв, главное что бы было несколько I


        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI + 1); // мы вз€ли предыдущий индек и добавили +1 что бы искать следующую i
        int thirdI = str.indexOf('i', secondI + 1);// мы вз€ли предыдущий индек и добавили +1 что бы искать следующую i
    }
}
