package day21Loop;

public class PrintDublicatedChar {
    public static void main(String[] args) {

        // ����� � ������� ������������� � ������ ����� (������������ ���� ����)
        // ��������� �������

        String str = "aabbbffvbnmjh"; // absdf - output
        String newWord = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(newWord.contains(""+ str.charAt(i))){
                   continue;// ���� � ���� ����� ��������� ��������-�����, �� �� ������ �� ����� ��������� � ���� ����������� ��� ������������
               }
                    for(int j = 0; j < str.length(); j++){
                        if(str.charAt(i) == str.charAt(j)){// ��������������� ��������� i �������� ���� � j, ������������ ���������� ����
                            count++;}// ������� ������� ������� ��� ������� ����������� ��������������� ����� � ������
             }// ����������

            if(count > 1){// ���� ������� ������ ������ ����, ��� ��������, ��� ����� ����������� ������ ������ ����(��������)
                System.out.print((str.charAt(i))); // ��������-����� �� �������� ����� �� � �������������
            }
newWord += str.charAt(i);// ����� �������� �� �������� � ��������� ������, ���������� ��� ����� ���������
        } // �������

    }
}