package day14string;

public class StringPractice {

    public static void main(String[] args) {

        String str1 = "pen";

        String str2 = new String("pen");
        System.out.println(str1 == str2); // false because there is two different objects

        System.out.println("--------------------------------------------------------------");
        String str3 = new String("pen");

        System.out.println(str2 == str3);// false because there is two different objects

        // �� ����� ������������ ����� equals(�������� ������� � ������ �� ��������) ��� equalsIgnoreCase (������� ������� ��� ����� �� ��������)- ��� � ����� �������� ������� � ������� true

        String day = "Tuesday";
        System.out.println(day.length());
        String day2 = "Friday";
        int result = day2.length();
        System.out.println(result);

        String str4 = " hello      ";
        int result2 = str4.length();
        System.out.println(result2);


        String word = "SummerWINTER";
        word.toUpperCase();

        System.out.println(word);

      //  word = word.toUpperCase(); // we reassigned into the variable.

        System.out.println(word.toUpperCase()); // ����� �������� ������ ����� ������ � ������� ���������
        System.out.println(word);

        System.out.println("================================================================");

        String word3 = "WINTER+SUMMER, AUTUM";

        word3 =  word3.toLowerCase();
        System.out.println(word3.toLowerCase());//�� ����� ���������� �����, ����� ������� ����� ������ � ������ ��������� ���� ����

        //System.out.println(word3);




    }
}
