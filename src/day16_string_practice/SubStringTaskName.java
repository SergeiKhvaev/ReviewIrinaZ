package day16_string_practice;
import java.util.Scanner;

public class SubStringTaskName {
    public static void main(String[] args) {
        // попросить ввесити ввести имя и ввести фамилию отдельными стороками
        // нужно вернуть оба имени в с большой буквы
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next().toLowerCase(); // chaining
        System.out.println("Enter second name");
        String lastName = input.next().toLowerCase();// chaining

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(firstName);
        System.out.println(lastName);



    }




}
