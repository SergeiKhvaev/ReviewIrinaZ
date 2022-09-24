package day20forlooppractice;

public class ForLoopMultiply {
    public static void main(String[] args) {

        // дается строка и число, нужно повторить последний символ в строке заданное число раз

        String s = "Hello";
        int end = 8;

        for(int i = 0; i < end; i ++) {
            s = s + s.charAt(s.length() -1); //прибавляю в существующей строке последнюю букву заданное количество раз

        }
        System.out.println(s);


    }
}
