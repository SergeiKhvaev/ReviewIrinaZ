package day17_strings_loops;

public class restOfMethods {

    public static void main(String[] args) {
        // isEmpty() method -провер€ет есть ли в строке символы. возвращает BOOLEAN, строка пустка, если в ней нет ни каких символов, нет букв, цифр, специальных символов, в том числе пустых пробелов
        String s = " ";
        System.out.println(s.isEmpty());

        // isBlank() - провер€ет есть ли в строке символы, не включает пустые пробелы, т.е. если есть пробел, но нет других символов, строка будет считатьс€ blank, возвращает boolean

        String a = "    ";
        System.out.println(a.isBlank());

        // replace("char" - что нужно заменить, "char" - на что нужно заменить)  звмен€ет все совпадающие символы в строке,если мы хотим заменить, то об€зательно нужно создать новую строку, т.к. стара€ неизменна.¬озвращает string

        String str = "java";



        System.out.println(str.replace('a', 'z'));

        str.replace(" ", " ");

String str3 = "an apple path";
        System.out.println(str3.replace("a", "(a)"));

        // common use case: delete spaces

        String str4 = "multiple words here";
        System.out.println(str4.replace(" ", ""));

        // есть вариаци€ этого метода replaceFirst() - замен€ет первый попавшийс€ совпадающий символ в задаваемой строке.

        // как заменить символ в середине? нужно создавать substring
        String d = "Wooden Spoon";
        int firstO = d.indexOf('o');
        int secondO = d.indexOf('0', firstO + 1);
        System.out.println(d.substring(0, secondO));
        System.out.println(d.substring(secondO). replaceFirst("o", "-"));
        System.out.println((d.substring(0, secondO)) + d.substring(secondO).replaceFirst("o", "-"));
        //FIX IT



    }
}
