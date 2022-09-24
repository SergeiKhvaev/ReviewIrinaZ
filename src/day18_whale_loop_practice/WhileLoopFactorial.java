package day18_whale_loop_practice;

public class WhileLoopFactorial {
    public static void main(String[] args) {

        // найти факториал 5! = 5*4*3*2*1 = 120
        int value = 5; // define factorial of 5, with each loop value will less by 1
      int num2 = value; // that will be part of loop condition

        while (num2 > 1) { // this is loop condition, while num2 will be bigger than 1 loop continue to cycling, and our initial nauber will be == initial value == 5
           num2 = num2 - 1; // just regular decrimenting to part of condition, to avoid infinit loop
           value = value * num2; // here we reassign and in order to multiplicate initial factorial by num, which will be less with every iteration ol the loop

       }
        System.out.println(value);

        System.out.println("================================================");

        // finde factorial of 8

        int initialNumber = 5; // число факториал
        int partOfCondition = initialNumber; // это будет часть условия, т.е. цикл начнется с с 5
        while (partOfCondition > 1){ // пока 5 больше 1 цикл будет продолжаться
            partOfCondition = partOfCondition -1; // уменьшение числа 5, которое является частью условия на 1 с каждим исполнением цикла
            initialNumber = initialNumber * partOfCondition; // эта операция исполняется пока цикл является true, при этом переменной initialNumber с каждым циклом будет присваеваться произведение, т.е.
        }
        System.out.println(initialNumber);






    }
}
