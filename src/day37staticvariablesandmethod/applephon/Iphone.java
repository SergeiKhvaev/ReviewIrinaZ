package day37staticvariablesandmethod.applephon;

public class Iphone {
    // instance variable
    String model;
    String color;
    double price;
    int storage;

    // static variables
    static String os;
    static String brand;

    static{// ��� ����� ������ ��������� ���������, ������ ������, ����� �� � ��� ����� ����� ������ � ��������. ������ ���� ����� ����������� �������  ���������� ������� (�������������)� ������ ���� ���, ����� ���� ������ ����� �.�. static block �� ����� ����� ������ �������� � ������ �������
        System.out.println("static block run");
        os = "IOS";
        brand = "Apple";
    }


// constractor use to initialize instance variable
    public Iphone(String model, String color, double price, int storage) {
        System.out.println("CONSTRACTOR RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }
    // static variable can be in constructor, bud not sholde be there

    /*
    ������� ����� ������ ������ � �������������

    ������ ���� ��������� ���� ��� ����� ����� ����� �����������

    ����������� ����� ����������  ������ ��� ��� ������ ����� �����������

     */

    @Override
    public String toString() {// ������������� ���������� ������ instance variables, �� �� ������������� ���� static veriables �������
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
