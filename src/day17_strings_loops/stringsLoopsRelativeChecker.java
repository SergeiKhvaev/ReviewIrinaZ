package day17_strings_loops;
//import java.util.Scanner;

public class stringsLoopsRelativeChecker {
    public static void main(String[] args) {
        //проверить являются ли люди родственниками

       // Scanner input = new Scanner(System.in);

        System.out.println("Full name 1 person");
        //String firstPerson = input.nextLine();

        System.out.println("Full na,e 2 person");
        //String secondPerson = input.nextLine();

        String name1 ="James Bond";
        String name2 = "James Bond";

        int indexOfSpase = name1.indexOf(' ');
        String lastName = name1.substring(indexOfSpase +1); // или можно добавить trim что бы убрать ненужный пробел перед фамилией в этом случае не нужно +1

        String lastNameSecondPerson = name2.substring(indexOfSpase +1);
        if (lastName.equals(lastNameSecondPerson)){
            System.out.println("Relates");
        }else {
            System.out.println("not related");
        }

                                        // or можно наисать вот такоей if code

        if (name2.endsWith(lastName)){
            System.out.println("Related");
        } else {
            System.out.println("not related");
        }








    }
}
