package day28javamethods;

public class ReturnMEthodVSVoidMethod {



    public static void sayHallo (){
        System.out.println("Hello");
    }



    public static String sayBay (){
        return "Bye";


    }



    public static void main(String[] args) {
        sayHallo();
        sayBay(); // ��� ������, �.�. �� ������ �� ������� � ������������ ���������, ������� � ������� ������ �����
        System.out.println(sayBay()); // ����������� ��� ������, �� ������������� ������ �� �� ����� ������������ ������!!!
        String str = sayBay(); //����� ������ ������ � ������ ��� � ����� ������

    }

}
