package day23ArraysLoopForEachLoops;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                       //0  1  2  3  4  5  6  7  8   9  indexes

        System.out.println(numbers.length); // �� �������� 9
        for (int i = numbers.length; i > 0 ; i--) {
            System.out.print(numbers[i -1] + " "); // �.�. �������� 9, �� ����� ������� -1 (������ 10 ���)


        }


    }

}
