package day39inharitance_encapsulation.discord;

public class Cydeo {
    public static void main(String[] args) {
        // call inctance of Super class - Discord user

        DiscordUser generalUser = new DiscordUser("Admin", "Etel", 2);
        System.out.println(generalUser);
        System.out.println(generalUser.role);
        System.out.println(generalUser.name);
        System.out.println(generalUser.id);
        generalUser.role = "Student";
        System.out.println(generalUser);

        System.out.println("==============================");
        Admin adminOne = new Admin("Admin", "Saim", 3.4, 1);
        adminOne.createChannel();
        System.out.println(adminOne.role);
        System.out.println(adminOne.name);
        System.out.println(adminOne.id);
        System.out.println(adminOne.adminNum);
        System.out.println(adminOne);
        adminOne.adminNum = 2;
        System.out.println(adminOne);
        adminOne.createChannel();

        System.out.println("=========================");
        Student sergei = new Student("Student", "Sergei Staropupkin", 6_5.4, 5 );
        sergei.sendMessage();
        System.out.println(sergei.role);
        System.out.println(sergei.name);
        System.out.println(sergei.id);
        System.out.println(sergei.studentNum);
        System.out.println(sergei);





    }
}
