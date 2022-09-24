package day30JavaMethodsPractice_wrapper;

public class Esty {
    public static void main(String[] args) {
        String s ="Item(s) total: $144.99";
        double price = Double.parseDouble (s.split(" ")[2].substring(1));// разбили строку на элементы по пробелам, взяли эелемент под индексом 2, вычеслили его подстроку начиная с индекса 1(что бы исключить $, и перевели эту подстроку из String в double (Double.parseDouble()
        System.out.println(price);

if (price >= 100){
    System.out.println("Check if shipping is free");
}else {
    System.out.println("Not free shipping");
    }
    }
}
