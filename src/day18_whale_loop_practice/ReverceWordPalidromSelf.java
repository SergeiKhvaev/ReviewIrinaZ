package day18_whale_loop_practice;

public class ReverceWordPalidromSelf {

    public static void main(String[] args) {


        String word = "tenanet1"; // ����� � ������ ����� ������ �� ��������
        String reverse = "";

        for(int i = word.length()-1; i >= 0; i --){ // ������� ����� ���������� - 1, �.�. ��� ����� � ����� �������������� � index. ������ ����� ���������� � int i ��� �� ���������������� loop, loop ����� true ���� i ����� ������ ��� ������ �����, �������, ��� ������ ����� ��������� ���������� i by 1. � ����� ������ ���� ���������� ��� ��������� ������ ������� ������� � ����� ����� tenanet
        reverse = reverse + word.charAt(i); // � ������ ����, ��� ��� ������ � ������ ���� � ��� ������������ �� ����� ��������� ����������� ����� � ����
            System.out.println(word.charAt(i)); // � ������ ������ ��������������� ��������� ������ ������� � ����� �����, �.�. i - 1 �� ������ ����� tenanet ���� �� ��������� ���������� ����� � ����� �� �����
        }
if (reverse.equals(word)){
    System.out.println(word + " is palindrom");
} else {
    System.out.println(word + " is not palindrom");
}


    }
}
