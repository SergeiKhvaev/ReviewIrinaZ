package day41exeptions.hidding;

public class Person {

    String name = "Sergei Khvalev";

}

class SecretIdentity extends Person {

    String name = "James Bond"; // we did variable hiding, original was hidden? but now I have new variable with same name

}

class Runner {
    public static void main(String[] args) {
        // � ���� ������ ���������� ������ ����� �������� ������ � ���������� - ��, �� � ���� ������ �������� ������, ��� �������� �� ����

        // ��� ������ ������ �������� ������� �� �������� ������ ������ ������������ � ����

        System.out.println(new Person().name); // which variable we will call depend from reference on what class we will use to call variable
        System.out.println(new SecretIdentity().name);// which variable we will call depend from reference on what class we will use to call variable



    }

}
