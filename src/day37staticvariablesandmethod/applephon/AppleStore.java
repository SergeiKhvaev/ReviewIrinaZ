package day37staticvariablesandmethod.applephon;

import javax.sound.midi.Soundbank;

public class AppleStore {
    public static void main(String[] args) {
        System.out.println(Iphone.brand);// ������� ������ �������� ��� �������� �������



        Iphone iphon1 = new Iphone("Iphon X", "Black", 1000, 256);
        System.out.println(iphon1);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);
// �� ����� �� ������� ������ ��������� ����� ������, �� ����� �������������� ����� ����� ��� ������

        System.out.println("=========================");
        // ������ ������ ����������� �����, �� ���������� ������ ���� ���, ��� �������� ������� �������

        Iphone iphone7 = new Iphone("Iphon 7", "Silver", 1200, 128);
        System.out.println(iphone7);
    }




}
