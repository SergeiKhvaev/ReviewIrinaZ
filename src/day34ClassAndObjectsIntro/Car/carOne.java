package day34ClassAndObjectsIntro.Car;

public class carOne {
    public static void main(String[] args) {
        carclass carOne = new carclass();
        System.out.println(carOne);
        carOne.model = "BMW";
        carOne.color = "White";
        carOne.year = 2023;
        carOne.fuelPercent = 85.5;

        System.out.println(carOne);

        carOne.drive(); // first method from class
        System.out.println(carOne.fuelPercent);// �������=�� ������� ������� ����������, ��������� ����� ����� �������� �������� ���������� fuelPercent,
        carOne.fillTank();
        System.out.println(carOne.fuelPercent);// �����������, ����� �������� �������� ��������� fuelPercent �� 100

        System.out.println(carOne);// called method toString? printed final info about object after all applied all methods


    }
}
