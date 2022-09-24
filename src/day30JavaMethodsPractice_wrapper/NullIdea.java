package day30JavaMethodsPractice_wrapper;

public class NullIdea {
    public static void main(String[] args) {
        String [] a = {"hello", "World", "friday"};
        System.out.println(a[0]); // hello
        System.out.println(a[0].charAt(0));// h

        String [] b = new String[2]; // [null, null] - пустой массив, в массив создан пустым, но массив есть
        System.out.println(b[0]); // null - означает, что где ищем там ничего нет -ЌќЋ№
        System.out.println(b[0].charAt(0)); //Exception in thread "main" java.lang.NullPointerException, т.е. объекта, который мы ищем нет в том месте, где мы ищем, charAt - Ёто стринг метод, но его нельз€ применить к пустому месту



    }
}
