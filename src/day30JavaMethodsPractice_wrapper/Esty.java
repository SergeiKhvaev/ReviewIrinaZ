package day30JavaMethodsPractice_wrapper;

public class Esty {
    public static void main(String[] args) {
        String s ="Item(s) total: $144.99";
        double price = Double.parseDouble (s.split(" ")[2].substring(1));// ������� ������ �� �������� �� ��������, ����� �������� ��� �������� 2, ��������� ��� ��������� ������� � ������� 1(��� �� ��������� $, � �������� ��� ��������� �� String � double (Double.parseDouble()
        System.out.println(price);

if (price >= 100){
    System.out.println("Check if shipping is free");
}else {
    System.out.println("Not free shipping");
    }
    }
}
