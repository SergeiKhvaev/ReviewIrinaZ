package adamofficehours.day3;

public class stringMethodsExplanation {
    //��� ���������� ������ ������? �  stuk and heap (in heap there is pool as well)   pool or heap memory

    String str = "Java"; // ���� ����� ��������� � POOL - ���� � ��� �� ����� � str2
    String str2 = "Java"; // ���� ������ ��� �� � POOL
    //str == str2 --> true // �.�. � POOL ������ ���� ������, ����� ������� ����� � str � str2 ���� � ��� ��


    String str3 = new String ("Java");
    String str4 = new String ("Java");
    //str3 == str2 --> false
    // str3 == str4 --> false

    // �.o. ��� ����������� ���������� ������ ����� ������������ ������ ������: equals(); or equalsIgorCase();
    //str.equals(str2) --> true
    //str3.equals(str2) --> true
    //str3.equals(str4) --> true





}
