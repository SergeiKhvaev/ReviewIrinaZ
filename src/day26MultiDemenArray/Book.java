package day26MultiDemenArray;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters do you want to write");
        int chapters = input.nextInt();

        input.nextLine();
        String[][] book = new String[chapters][];

        for(int i = 0; i < chapters ; i++){
            System.out.println("Type your chapter");
         book[i] = input.nextLine().trim().split(" ");// ������ ������ �� �������, ������� ������ ������� � ��������� ������ �� ��������, ������ ����� ����� ����� ��������� ����������� ��������

        }

        System.out.println(Arrays.deepToString(book));

        // ��� ���������� ������ ���������� ������

        for(int i = 0; i < book.length; i++){

            System.out.println(Arrays.toString(book[i])); // �������� ������ ���������� ������ 1 ���
        }
        // ��� ���������� ������ ����� �� ����������� �������

        for(int i = 0; i < book.length; i++){
            for(int j = 0; j < book[i].length; j++){
                System.out.println(book[i][j]);
            }
        }

    }
}
