package day21Loop;

public class NesstedLoopPractice {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 9; j++) { // � ���� ������� ����� �� ���������, ������� � ������ ������(������� ����) ���������� ���-�� *
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("===================================");
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {// ��������� ����, ������� � ������ ������ �������� ����� ������ �� ���� *
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}