package day18_whale_loop_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class colorsSelection {
    public static void main(String[] args) {

        int attempts = 0;
        Scanner input = new Scanner(System.in);
        Boolean green = true; // ����� ����������� ��������� ���� ��������
        boolean red = true;// ����� ����������� ��������� ���� ��������
        boolean yellow = true;// ����� ����������� ��������� ���� ��������
        boolean black = true;// ����� ����������� ��������� ���� ��������
        String colorChosen = "";// ��� ��� ����� ����, �� �����-��


        while (attempts < 3) { // ��� ������ ����� loop ������ ���������
            System.out.println("Select  color, please"); // ������ ������ ����
           String color = input.next();

          if (green && color.equals("green")) { // ��� ������ ����� if ������� ������ ������, �.�. green boolean =true � � ������ ��������� ���� �������������� ������� ��� ������ ��� ������ ��� ������ �������������� ��� ������� if. ����� green ����� � if -> ������������� ��� ����� if �����, ��� ������ ������� + green ���� ������ �����������, �.�. false (���� if ��� �� ����� �������� ��� ��������� �������� ����� green, �.�. green ��� false, � ������� - green (�.�. ������ ���� true) && color.equals("green"). � � ���� ��� ����� If ������ loop ����� ���� ��������, �.�. ����� ����������� ���� ������ � ������ IF ���������� ���� ���� loop. � ��������, ���� �� ���� IF �� �������� ��� �����, ��� �������� ����������� ����, ���� �� �������� ��� ������ �����
                System.out.println("You took green");
                green = false;
                //colorChosen = color + "+";
                attempts = attempts + 1;
            }
           else if (red && color.equals("red")) {
                System.out.println("You took red");
              //  colorChosen = color + "+";
                red = false;
                attempts = attempts + 1;
            }
             else if (yellow && color.equals("yellow")) {
                    System.out.println("You took yellow");
                    //colorChosen = color + "+";
                    yellow = false;
                    attempts = attempts + 1;
                }
             else if (black && color.equals("black")) {
                    System.out.println("You took black");
                  //  colorChosen = color + "+";
                    black = false;
                    attempts = attempts + 1;
                    }

                    }
        System.out.println(colorChosen);
                }


            }


