package day20forlooppractice;

public class ForLoopPrimeNumber {
    public static void main(String[] args) {
        //определить является ли число пряйм числом, пряйм число это число которое делиться только на 1 и на само себя
int n = 11;
boolean isPrime = true;

for(int i = 2; i < n; i++) {

    if (n % i == 0){
        isPrime = false; // true меняем на false потом что цикл нашел что задаваемое число делиться на какое то число кроме 1 и само себя
    }
}
       System.out.println(isPrime? "Prime" : "Not prime");

    }

}
