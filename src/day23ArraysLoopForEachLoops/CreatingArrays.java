package day23ArraysLoopForEachLoops;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {

    public static void main(String[] args) {
        // Student one
        // 0 - Id
        //1 - first name
        // 2 - second name
        // 3 butch num

        // if we have all information
        String[] studentOne ={"04", "Sergei", "Khvalev", "27"}; // ������� ��� ���������� ������
        System.out.println(Arrays.toString(studentOne));

        // we know numbers of elements, but dont know values of info
        String[] studentTwo = new String[4]; // ������� ������ �������� 4
        //values we assighnet to array later
        studentTwo[0] = "10"; // ��������� ������ ������ �������
        studentTwo[1] = "Eva";// ��������� ������ ������ �������
        studentTwo[2] = "Starovoitova";// ��������� ������ ������ �������
        System.out.println(Arrays.toString(studentTwo)); // ���������� ������ � �������




        // knowing of numbers of elements, and add element by element from scanner

      Scanner input = new Scanner(System.in);
     //   String [] studentThree = new String[4]; // ������� ������ � �������� 4
     //   System.out.println("Enter ID");// ��������� ������ ������ �������
        //studentThree[0] = input.next();
       // System.out.println("Enter first name");// ��������� ������ ������ �������
       // studentThree[1] = input.next();
      //  System.out.println("Enter last name");// ��������� ������ ������ �������
      //  studentThree[2] = input.next();
      //  System.out.println("Enter your batch");// ��������� ������ ������ �������
      //  studentThree[3] = input.next();
       // System.out.println(Arrays.toString(studentThree)); // ���������� ������ � �������



// most dynamic way to create array

        String[] studentFour = new String[4];
        String[] question = {"id", "first name", "last name", "butch number"};// ������� ������ � ����������� ��������
        for(int i = 0; i < studentFour.length; i++){ // ���� ������� ����� ��������� ���������� ����� �������� � ������ ������� string
            System.out.println("Enter your " + question[i]);// ��������� ��������� ������������ ����� ������� � ��������� �������, � ������� �������� ��������� ��������, ����� �������, ��� ������ �������� ��������� ����� ������(������������ ������ �� ���������� ����� � ���������� �����, ���������� � ���������� ��������� ������� �� ����� ���������� ����������(����������� ��������)
            studentFour[i] = input.next(); // ��������� � ������� ������������ ������ �������� 4 ��������� ������

        }
        System.out.println(Arrays.toString(studentFour)); // ���������� ������ � �������



    }
}
