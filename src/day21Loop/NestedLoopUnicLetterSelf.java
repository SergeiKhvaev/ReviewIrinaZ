package day21Loop;

public class NestedLoopUnicLetterSelf {
    public static void main(String[] args) {

        String str ="dfferrddfddf";
        int counter = 0;

        for(int i = 0; i < str.length() ; i++){ // ������� ����
            counter = 0;// �������� ��� ������ ������� ��������, ��� �� ������� ������ i ������ � ����
                        for(int j = 0 ; j < str.length() ; j++){// ���������� ����, ���������� ������ i �������� ���� ����� ��������� �������� j, �������������� ����������� ����
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }

            } // inner

            if(counter == 1){// ���� ������� ����� 1, ������ ������ ��� ��������� ������ ���������� ������ ���� ���
                System.out.println(str.charAt(i));
            }

        }//outer





    }
}
