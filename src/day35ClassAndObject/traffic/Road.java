package day35ClassAndObject.traffic;

public class Road {
    public static void main(String[] args) {

        TrafficClassLight light = new TrafficClassLight("green");
       // light.color ="red";  ����� ����� ����������� � ���������� variable �� ������, � ��������� ���� ����� ��� ����������� variable - �������� � ������ �������� ������� � ��� �������, ��� ��������� variable one by one
        System.out.println(light.color);


        // code good, but invalid result (color cant be BLUE)
        TrafficClassLight light2 = new TrafficClassLight("white");
        System.out.println(light2.color);
// ����������� ���� ����������� �������������� ���� ��� ��������� ������� �� ���������������� ������
    }

}
