package day18_whale_loop_practice;

public class ReverceWordPalidromSelf {

    public static void main(String[] args) {


        String word = "tenanet1"; // цифры в длинне слова пойдут на убывание
        String reverse = "";

        for(int i = word.length()-1; i >= 0; i --){ // ждлинна слова помещается - 1, т.к. все нужно в итоге конвертировать в index. длинна слова помещается в int i что бы инициализировать loop, loop будет true пока i будет больше чем длинна слова, наконец, при каждом цикле уменьшаем переменную i by 1. В итоге каждый цикл определяет нам очередной индекс символа начиная с конца слова tenanet
        reverse = reverse + word.charAt(i); // с учетом того, что это стринг с каждым лууп в нее записывается по одной очередной вычесленной букве с зада
            System.out.println(word.charAt(i)); // с каждым циклом распечатывается очередной символ начиная с конца слова, т.к. i - 1 от длинны слова tenanet этим мы достигаем распечатки слова с задом на перед
        }
if (reverse.equals(word)){
    System.out.println(word + " is palindrom");
} else {
    System.out.println(word + " is not palindrom");
}


    }
}
