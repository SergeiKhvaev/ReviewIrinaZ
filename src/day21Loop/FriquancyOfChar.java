package day21Loop;

public class FriquancyOfChar {
    public static void main(String[] args)
    { //  given java
        //output j -2, a - 2, v -1

        String str = "java";
        String checked ="";


        for(int i = 0; i <str.length(); i++){ // ������� ��� ��������� ���� ������ ����������� ���������� ���

            int counter = 0; // ������ ����� �� ���� ��� ������ �������
           if(checked.contains("" + str.charAt(i))){// ���������� ������ ������� ���������� ���, ���� ������ ��� ��� ��������
                continue;
          }
            for(int j = 0 ; j < str.length(); j++){ // ���������� ��� ���������� ������ at i � ������ �������� � ������ --> charAt(j)
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }

            System.out.println(str.charAt(i) + " - " + counter);
            checked += str.charAt(i);
        }













    }

}
