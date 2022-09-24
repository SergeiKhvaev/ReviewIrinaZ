package day18_whale_loop_practice;
import java.util.Scanner;
public class BiggestNumber {

    public static void main(String[] args){

        //просим напечатать 5 чисел, нунжно найти большее из них и меньшее из них

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // определили наименьшее число тогда любой ввод будет больше этого числа, с этой цифрой будет сравниваться первое введенное число
        int min = 2147483647; // отпредели наибольшее число, тогда любой ввод будет меньше этого числа, с этой цифрой будет сравниваться первая введенная цифра
        int num = 0; // для отслеживания сколько циклов пройдет
        System.out.println("Enter five numbers, please");

        while(num ++ <= 5){ //  цикл будет повторяться 5 раз, т.е число итераций
            System.out.println("Enter numbers");
            int inputNum = input.nextInt();
            if (inputNum > max); {

                max = inputNum;
            }
            if (inputNum > min) {
                min = inputNum;
            }
            // при вводе первого числа это число автоматически присваевается к int max и int min, затем новый цикл уже сверяет следующую введенную цифру с новыми уже присвоеными значениями.


// смысл в том, что при такой программе каждый следующий ввод цивры присваевает ее значение к int max или int min, этот ввод соответственно больше или меньше предыдущего ввода и так 5 вводов новых чисел, что соответствует 5 циклам лууп

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);






    }
}
