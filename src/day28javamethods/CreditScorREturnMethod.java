package day28javamethods;

public class CreditScorREturnMethod {

    public static void main(String[] args) {
        checkScore(800);// ������ �����������, �� ������ �� �� ����� ������������ ��� ���������� ��� �� reusible
        checkScore2(789);// ������ �� ����������, �� ������ �� �������, �.�. �� �� ��� �� �� ����������

        System.out.println(checkScore2(800)); // ����� ������ �����������

        if (checkScore2(789)){ // ������ ����� �� ��� ����� ������������ ������������ ��������, � ���� ����� return method, ����� �������, ���������� �� ������ ������ �� ����� ������������ � ���� ������
            System.out.println("Get loan");
        } else {
            System.out.println("Get higher score");
        }


    }


    public static void checkScore (int score){
        if(score > 700){
            System.out.println("Good score");
        } else {
            System.out.println("Not good score");
        }
    }

public static boolean checkScore2 (int score){
        return score > 700;
}


}
