package day20forlooppractice;

public class ForLoopPrimeNumber {
    public static void main(String[] args) {
        //���������� �������� �� ����� ����� ������, ����� ����� ��� ����� ������� �������� ������ �� 1 � �� ���� ����
int n = 11;
boolean isPrime = true;

for(int i = 2; i < n; i++) {

    if (n % i == 0){
        isPrime = false; // true ������ �� false ����� ��� ���� ����� ��� ���������� ����� �������� �� ����� �� ����� ����� 1 � ���� ����
    }
}
       System.out.println(isPrime? "Prime" : "Not prime");

    }

}
