package day27ArraysMEthods;

import javax.swing.plaf.IconUIResource;

public class CarJavaMethods {

    /*
    �������� ������������� ������
    1. ������� ������
    2. ������� �����
    3. ����� � ������� � ������� ��
    4. ��������� �������
    5. �������������
    7. ������� �������� � �������
     */
    public static void unlock(){
        System.out.println("Unlocking car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void sitDownAndStart(){
        System.out.println("sit down in seat");
        System.out.println("Adjust seat");
        System.out.println("Inset key and start engin");
    }
    public static void mirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking right view mirror");
        System.out.println("Checking rear mirror");

    }
    public static void belt(){
        System.out.println("Put on seat belt");
    }
    public static void drive(){
        System.out.println("Putting in drive");
        System.out.println("Pressing accelerator");
        System.out.println("Driving");
    }

    public static void inCaseYouLate (){
        unlock();
        sitDownAndStart();
        drive();
    }

    public static void main(String[] args) {

        unlock();
        sitDownAndStart();
        mirrors();
        belt();
        drive();


        System.out.println("==============================================");

inCaseYouLate();

    }
}
