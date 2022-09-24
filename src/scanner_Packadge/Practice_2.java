package scanner_Packadge;

import java.util.Scanner;

public class Practice_2 {

    public static void main(String[] args){

        Scanner InformationAboutYou = new Scanner(System.in);

        //count members of your family
        System.out.println("How many members my family : ");
      int familyMembers =  InformationAboutYou.nextInt();

                // what is avarege age of members of your family
        System.out.println("What is avarege age of members of my family: ");
        double avaregeAge = InformationAboutYou.nextDouble();

        InformationAboutYou.nextLine(); // catch ENTER in Scanner memory

        // what is name of your wife
        System.out.println("What is the name of my wife: ");
        String wifeName = InformationAboutYou.nextLine();

        // what is faforite language of your family
        System.out.println("What is favorite language of my family");
        String favoriteLanguage = InformationAboutYou.nextLine();

        // There is 4 childrens in your family
        System.out.println("Is your family has four childrens");
        boolean areFourChildrens = InformationAboutYou.nextBoolean();

        System.out.println("Members of my family: " + familyMembers);
        System.out.println("Avarege age of my family member: "+ avaregeAge);
        System.out.println("My wife name: " + wifeName);
        System.out.println("My family favorite language: " + favoriteLanguage);
        System.out.println("There are four childrens my family: " + areFourChildrens);






    }

}
