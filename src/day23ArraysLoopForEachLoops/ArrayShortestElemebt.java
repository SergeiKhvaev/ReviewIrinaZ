package day23ArraysLoopForEachLoops;

public class ArrayShortestElemebt {

    public static void main(String[] args) {

        String [] names = {"Sergy", "Katia", "Etel", "Anatoliy"};
        String shortest = names[0];// ���������� �� ��������� ��� ����� ��� �������� 0 � ������� ����� ��������
        for(int i = 0; i < names.length ; i++){ // ����� ������� ��� � ����� +1, ��� ���������� �������� ����� ���������� ��������� � �������, ��� �� �������� ������ �� ���
            if(shortest.length() > names[i].length()){ // ����������  ������ �������� ��� �������� 0 � ��������� ��� �������� 0, 1, 2, 3 ��� ������ ��������
                shortest = names[i]; // ��� ������ �������� �� ������ �������� � ����������������� ��������� �������� ����� ������� ������� � ����� ��� �� �������� � ���������� ��������� ������. �������������� ����� ���������� ����� � ��� �������� ����� ������ ������� (�����) � �������� �������
            }
                    }
        System.out.println(shortest);

        System.out.println("------------------------------------------------------");

        String[] cars ={"BMW", "Merds", "Honda", "Toyota", "Tesla"};
        String longest = cars[0];
        for(int i = 0; i < cars.length; i++){
            if(longest.length() < cars[i].length()){
                longest = cars[i];
            }

        }

        System.out.println("Longest name of car brend is " + longest);

        System.out.println("------------------------------------------------------");

        String [] colorName = {"Blue", "White", "Red", "Orange", "Grey-purpule"};
        String longestName = colorName[0];// �� ��������� ����� ��� ������ �������� ����� ������� � ������ �������
        String shortestName = colorName[0]; //�� ��������� ����� ��� ������ �������� ����� �������� � ������ �������

        for(int i = 0 ; i < colorName.length; i++){
            if (longest.length() < colorName[i].length()) {
                longest = colorName[i];
            } else if (shortest.length() > colorName[i].length()){
                shortest = colorName[i];
            }
        }
        System.out.println("Longest element  in array - " + longest);
        System.out.println("Shortest element  in array - " + shortest);





    }
}
