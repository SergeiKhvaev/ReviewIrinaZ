package day24Arrays;

public class ArrayPrintNotPalidrom {

    public static void main(String[] args) {

        /*
        Given a String array. Find and print  not Palindrome String in your array.

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */
        String[] words = {"abc", "dna", "kevin", "joe", "lamp"};

        int count = 0; // ������� ���������� ����������
               for(String each : words){// ������� each for loop ��� ��������� ������� �������� �������
                   String eachReverse ="";// ������� ��� �������� ������� ������� ��������. ������ ����������� �� ������ ������, ��� ������ ������ �������� �������� ����
           for(int i = each.length() - 1; i >= 0; i--){// ������� ��� ���������� ���� ��� ���������� ������� ������� �������� �������
               eachReverse += each.charAt(i); // �������� ������ �������� � ��������� ����� ����������
           }
           if(each.equals(eachReverse)){ // �����! ����� �� �������� �������� �� ������ ������� �������� ������� ����������
            count++;// ���� ������ �������� �����������, �� ������� ���������� �����������
            break;// ���� ����� ���� �� ���� ���������, ��������� ���������� ��� �� �������������, �.�. ��� ������� ���� ��������, ����

           }
           }
               if(count >0){// ��������� IF statment �� ��������� ���� ����, ������� ��������� ���� ������ �� ������� � ��� ���� �� ������ ��������. ���� ���� ������� �� ����� � ������ ������ ������ - ������ � ������� ������� ��� ������� ���� ���������
                   System.out.println("Poligran exist");
               } else{
                   System.out.println("No poligram");// �����������, ���� �������� �� ��������, �.�. ���� count = 0
               }


       }// outer
        //������� ����� �������



        }
