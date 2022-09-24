package day16_string_practice;

public class IndexOf_method {

    public static void main(String[] args) {

        String s = "lollipop";
        System.out.println("index of L " + s.indexOf("l"));
        System.out.println("last index of L " + s.lastIndexOf('l'));
        System.out.println("index of i " + s.indexOf('i'));
        System.out.println("index of i " + s.lastIndexOf('i'));

        System.out.println("index of p " + s.indexOf('p'));
        System.out.println("index of p " + s.lastIndexOf('p'));

        System.out.println("index of pop " + s.indexOf("pop")); // возвращает один индекс, с которого задаваемая последовательность начинается





    }
}
