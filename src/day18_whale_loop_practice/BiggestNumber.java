package day18_whale_loop_practice;
import java.util.Scanner;
public class BiggestNumber {

    public static void main(String[] args){

        //������ ���������� 5 �����, ������ ����� ������� �� ��� � ������� �� ���

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // ���������� ���������� ����� ����� ����� ���� ����� ������ ����� �����, � ���� ������ ����� ������������ ������ ��������� �����
        int min = 2147483647; // ��������� ���������� �����, ����� ����� ���� ����� ������ ����� �����, � ���� ������ ����� ������������ ������ ��������� �����
        int num = 0; // ��� ������������ ������� ������ �������
        System.out.println("Enter five numbers, please");

        while(num ++ <= 5){ //  ���� ����� ����������� 5 ���, �.� ����� ��������
            System.out.println("Enter numbers");
            int inputNum = input.nextInt();
            if (inputNum > max); {

                max = inputNum;
            }
            if (inputNum > min) {
                min = inputNum;
            }
            // ��� ����� ������� ����� ��� ����� ������������� ������������� � int max � int min, ����� ����� ���� ��� ������� ��������� ��������� ����� � ������ ��� ����������� ����������.


// ����� � ���, ��� ��� ����� ��������� ������ ��������� ���� ����� ����������� �� �������� � int max ��� int min, ���� ���� �������������� ������ ��� ������ ����������� ����� � ��� 5 ������ ����� �����, ��� ������������� 5 ������ ����

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);






    }
}
