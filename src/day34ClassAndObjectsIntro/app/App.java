package day34ClassAndObjectsIntro.app;

import javax.sound.midi.Soundbank;

public class App {
    String name;
    double version;
    boolean isFree;
    int rating;

    public void update(){
        System.out.println(name + " is updated");
        version += 0.1;

    }

    public String toString(){ // ����� ������� ���� ��� ���������� ����������� ��������� ���� ������ � ���������� ����������� (�������� �� �������� ����������, ���� ��������� ������ �����)
        return "Name: " + name + "\nVersion : "+ version+"\nisFree: " + isFree +"\nRating :" + rating;
    } // ���� ����� �������, � �� ��� ����� ������� � class to define how we to see how our object when we print it by this method
}
