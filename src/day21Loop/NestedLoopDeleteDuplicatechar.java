package day21Loop;

public class NestedLoopDeleteDuplicatechar {
    public static void main(String[] args) {

        String str = "aaabcccdeef";
        String newStr ="";// �������, ��� �� ������� ��� ������������ ������ �����
        for(int i = 0; i < str.length(); i++){
            if(!newStr.contains(str.substring(i, i+1))){// ���� ������ newStr �� ��������(�.�. ������ ��������) � ���� ���������, ������� ���������� ������ ������ str, �� ���� ����� ������� � newStr. ��������� ��� �������� ���� ������ ������ �� ����������
                newStr+= str.charAt(i);
            }
        }
        System.out.println(newStr);

        System.out.println("================================");
        String str1 = "aaabcccdeef";
        String newStr1 = "";

        for(int i = 0; i < str1.length(); i++){
            if(!newStr1.contains("" +str1.charAt(i))){//���� ������ newStr �� ��������(�.�. ������ ��������) � ������ ��� �������� str.charAt(i), �� ���� ����� ������� � newStr. ��������� ��� �������� ���� ������ ������ �� ����������
                newStr1 = newStr1+str1.charAt(i);
            }
        }

        System.out.println(newStr);


    }
}
