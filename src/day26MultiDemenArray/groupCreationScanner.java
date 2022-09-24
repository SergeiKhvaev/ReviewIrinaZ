package day26MultiDemenArray;

import java.util.Arrays;
import java.util.Scanner;

public class groupCreationScanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("How many groups do you want to create");
      int groupNumbers = input.nextInt();
        System.out.println("How many people each group");
        int i = 0;// Индекс элемента каждой группы(массива)
     int peopleInGroup = input.nextInt();

        input.nextLine();

        String [][] school = new String[groupNumbers][peopleInGroup];
        for(String eachName []: school){
            System.out.println("Enter the names");

            school[i] = input.nextLine().trim().split(" ");
            i++;


        }

        System.out.println(Arrays.deepToString(school));
        System.out.println(school.length); // размер многоуровневого массива
        System.out.println(Arrays.toString(school[0]));// вывести имена первого массива
        System.out.println(school[0].length);// размер первого массива

        System.out.println("============================");

for(String eachArr[] : school){
    System.out.println("Each class");
    System.out.println(Arrays.toString(eachArr));
}


    }

}
