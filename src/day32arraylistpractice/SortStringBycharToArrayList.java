package day32arraylistpractice;

import javax.sound.midi.Soundbank;
import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class SortStringBycharToArrayList {
    /*
Separate Parts
Write a program that can extract the special characters,
digits and letters from a string and stores them into
separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}

     */
    public static void main(String[] args) {

//������ ������ ��� ������� �������, ������ ������ ����������, ����������
        String str = "ABCD123$%#@&456EFG!";// (�������������� ����������� (�������� ��������� Wrapper class, autoboxing, ������������� ����, ��� ����� � ������ - ��� � char ������� ������������� �������� � Character ����� ����� �� �������� � ArrayList, ����� ����������� ����, ��� ����� � String is String as well, �������������� ��� non primitive type � ��� �� ����� ����� �������� � ArrayList - ��� ��� �������� ��������� ������� ��� � ����� ������(���� ������� ���� � ������� �� ������(�������� ������� ��������� �����)) - ������ ������ �� �� ����� ���������, ����� �� �� ���-�� ��������������, ��� ���� ���� ��� ����� � ����� ��������� characters �� ������ ��� �� ����� ����� ������� � ��� ���� data structure, where element is separate CHARACTER � ��� �� ����� ���� char [], ��� ��� ������� � ����� ������� ����� char, ������� �� �� ������ ������� � ����� ������ ���� �����, ����� ��� ����������� ������ ���. ����� �������, ��������� �� ������ ������ data structure ��� ArrayList, ��� ������ ������� is not char, but Character. Need to convert String --> ArrayList<Character>
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();
        char [] arr = str.toCharArray(); // convert String to char []
        System.out.println(Arrays.toString(arr));// convert char[] to ArrayList<Character> - that we need finally

        for (char element : arr){
            if (Character.isDigit(element)){
                digits.add(element);
            }else if(Character.isLetter(element)){
                letters.add(element);
            }else {
                symbols.add(element);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

        /*
        ����� �������� �������
         String str = "ABCD123$%#@&456EFG!";// ����� ��������� ����� �� ������ ����� ����, ��������� ������ ����� ����������� Charagter, � ��������� ��� ����� �� ������ ArrayList
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();


        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                digits.add(str.charAt(i));
            }else if(Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i));
            }else {
                symbols.add(str.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

         */

    }
}
