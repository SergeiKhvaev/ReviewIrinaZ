package day21Loop;

public class FrequancyOfCharSelf {
    public static void main(String[] args) {
        String str = "Apple";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0; // reset with every outter loop cycle begin

            if (!checked.contains("" + str.charAt(i))) { // �� ���������� �������� ����� ������� ��� ���������, �.� ���� � ����� ��� � ����� ���������� �����, ��� ���������� ��������� ���������� ����� �� ���, � ���� ������ ����������� � ����� ��� ���, �� �������� ������ ����� ��������� � �������� ���������� ���� �� ��������� ���������� ����� � �����
                // continue; (���� ��� ����� ������������, �� ��� ��������� IF �� ���������� ���� // ��� �������� ����� �� ������� ���������, ������� ������� ��������� ������ ���� --> if(!checked.contains(""+str.charAt(i))), � ���� ������ ��� ���� �������� ���: ���� � �������� ����� ������� �� ���� ��� ���������, �� ����������� ���


                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                    }
                }
                System.out.println(str.charAt(i) + " " + counter);
                checked += str.charAt(i);

            }


        }
    }
}