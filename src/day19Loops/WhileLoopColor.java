package day19Loops;
import java.util.Scanner;
public class WhileLoopColor {

    public static void main(String[] args) {
        // select three different colors// ���� ������ �������� ���� �� ����� ������� ��� ������ �����
        Scanner input = new Scanner(System.in);

        int numberOfColors = 0;// ����� ����� ��������� ������ ����� �����, ���������� ��� �� ������ ������� � �����
        String colors = ""; // ����������, ��� �� ���� ����������� ������������� ����, � ����� ��� �� ��� �� ������� ��������� � ����� �����


        while(numberOfColors < 3) {
            System.out.println("Enter the next color");
            String inputColor = input.nextLine(); // ���� �����

            if (!colors.contains(inputColor)) { // if , true � ����� �������� ���� �������� ���� ����� ���������� ��� ����� ������� ��������� ���� �� �����  ��������� ��� ��������� ����, ��� ���� ����� ��������� ���� ������������� ��������, �� ��� �������� ������
                colors += " " + inputColor; // ���� �� ������������� ����� ����, ��� �� ��������� if ���������, ��� �� ������ ����� String method.contains, ����� ����� �������������� ���  ���������  ���� ������ ��������� ������ ������ ���� + ������ ���� + ������ ����.
                numberOfColors++;// ���������� ����� �������, ��� ���� ���������� ����� ������� ���������� ����� ����������� ���������� ������ if statmenta, ���� IF �� �������� ����������, �� ���� ���� ����������� ��������� ���.
        }
        }

        System.out.println(colors);

        }













}


