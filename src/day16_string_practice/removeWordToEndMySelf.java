package day16_string_practice;
import java.util.Scanner;
public class removeWordToEndMySelf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence, please ");
        String sentance = input.nextLine().trim(); // ����� ��������� ������� ����� ������������

        String str2 = sentance.substring(0,sentance.indexOf(" "));
        String str3 = sentance.substring(sentance.indexOf(" "));
        System.out.println(str3 + " " + str2);





    }

}
