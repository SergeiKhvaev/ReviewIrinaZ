package day16_string_practice;
import java.util.Scanner;
public class createAnEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord = input.nextLine();
        String first3Letter = firstWord.substring(0,4).toLowerCase(); // James

        System.out.println("Enter second word");
        String secondWord = input.nextLine();
        int lastThreeCharOfSecW = secondWord.length() - 3;
        String lastThreeCharOfSec = secondWord.substring(lastThreeCharOfSecW).toLowerCase();

        if (firstWord.length() <= 6 && secondWord.length() <= 6) {
            System.out.println("Invalid data, end of program");
        } else {
           String newWord =first3Letter +  lastThreeCharOfSec;
           String eMail = newWord + "@cydeo.com";
            System.out.println(eMail);
        }
    }

}
