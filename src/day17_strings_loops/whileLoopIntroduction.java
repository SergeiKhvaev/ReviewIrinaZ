package day17_strings_loops;

public class whileLoopIntroduction {
    public static void main(String[] args) {


        //System.out.println("hello World!"); // how to print it 10 times easly. need tu build loop aroude that staitmente

        int counter = 1;
        while(counter <= 50) {

            System.out.println("hello World!" + counter);
            counter ++; //  �� ������������ ���������������� ����� ��� ����� �� ����������� counter �� 1 ��� ������ ����� == counter = counter +1;
        }
    }
}
