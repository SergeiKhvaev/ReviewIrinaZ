package day21Loop;

public class NesstedLoopPractice {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 9; j++) { // в этом примере циклы не соединины, поэтому в каждой строке(внушний цикл) одинаковое кол-во *
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("===================================");
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {// соединяем цикл, поэтому в каждой строке внешнего цикла меньше на одну *
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
