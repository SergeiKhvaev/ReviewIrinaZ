package day19Loops;


import java.util.Scanner;

public class ForLoopFactorialSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");

        int factorialNumber = input.nextInt(); // ввод лбого числа
        int num = 1; // для будущего переназначения
        String result = "Factorial of number " + factorialNumber + " is "; // для написания конечного сообщения

        for (int i = factorialNumber; i > 1; i = i -1){ // инициализация через ввод переменной int--> присваивание этой переменной значения введенного числа, что бы определить условие цикла, затем определение условия до каких пор будет цикл true, затем определили условие шага цикла, т.е. с каждым loop  -1 от i
            num = num * i; // определили операцию которая будет произодиться в каждом цикле, она состоит в том, что num будет последовательно при каждом цикле перемножаться на последовательно убывающий i

        }

        System.out.println(result + num);














    }
}
