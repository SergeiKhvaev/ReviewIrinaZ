package day22arrays;

import java.util.Scanner;

public class ArrayPricticeSelectMounth {
    public static void main(String[] args) {

        // ïîïğîñèòü íàïè÷àòàòü öèôğó ñîîòâåòñòâşùóş ìåñÿöó, è íàïå÷àòàòü ıòîò ìåñÿö

        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "December"};

        System.out.println("Enter month number");
        int num = input.nextInt();
        if(num >= 1 && num <13) {
        System.out.println(months[num-1]); //we connected Scanner and array, óêàçàëè -1 ÷òîáû ñèíõğîíèçèğîâàòü indexes â ìàññèâå, êîòîğûå íà÷èíàşòñÿ ñ 0 è ââîä ñî Scanner îò 1-12
      }else {
            System.out.println("Invalid number");
       }



    }
}
