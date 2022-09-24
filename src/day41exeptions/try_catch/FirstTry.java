package day41exeptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {


        try{ // try block runs when all code good, there no any exception happened, if exception happened - catch block handle that exception, and code not stops
            String s = "Hello World!";
            System.out.println(s.charAt(0)); // execute, no exception
            System.out.println(s.charAt(100)); // not execute, program jump to catch block, run tringIndexOutOfBoundsException e object, or another code, contained in catch block
            System.out.println(s.charAt(1)); // code note execute, because program jump to catch block because appropriate exception occur
        } catch(StringIndexOutOfBoundsException e){ // we can consider it like parameter/ StringIndexOutOfBoundsException  - type (object), e - name of type/ StringIndexOutOfBoundsException e we can consider like regular reference.
            System.out.println("String was to short. It went out of bounce");

        } // catch block only run if exception outOfbounds happened, if. catch block catch exceptions, and execute in this situation what we need

        System.out.println("Hello"); // rest of


        System.out.println("=============================");


        try{
            Thread.sleep(5000);// �������� Hello �������� �� 5 ������ , �������� World

        } catch(InterruptedException e){// ���� �� �����-�� �������� (������ ��������, �������) �������� ����� ����� 5 ������, catch block will catch it � ������ invalid time given � ������ ����� ����������� ������ - World, �.�. catch block �� ���� ���������� ���������� ���������, ������ ������� exception
            System.out.println("Invalid time given");

        }

        System.out.println("World");

    }
}
